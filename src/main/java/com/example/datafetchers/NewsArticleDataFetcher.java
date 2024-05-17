package com.example.datafetchers;

import com.generated.types.Article;
import com.generated.types.ArticleFilter;
import com.generated.types.submittedArticle;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

@DgsComponent
public class NewsArticleDataFetcher {

    @DgsQuery
    public List<Article> articles(@InputArgument("filter") ArticleFilter filter) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        Connection conn = null;
        List<Article> queriedArticles = new ArrayList<>();

        try {

            conn = DriverManager.getConnection(url);

            if (conn != null) {
                System.out.println("Connected to the database successfully!");
            }

            PreparedStatement pstmt = conn.prepareStatement(
                    "select * from news.news_articles"
            );

            ResultSet res = pstmt.executeQuery();

            while (res.next()) {
                String link = res.getString("link");
                String headline = res.getString("headline");
                String category = res.getString("category");
                String short_description = res.getString("short_description");
                String authors = res.getString("authors");
                Date pub_date = res.getDate("pub_date");

                Article a = new Article(link, headline, category, short_description, authors, pub_date);
                queriedArticles.add(a);
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database");
            e.printStackTrace();

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error closing the connection");
                ex.printStackTrace();
            }
        }

        return queriedArticles;
    }

    @DgsMutation
    public Article addArticle(@InputArgument("article") submittedArticle submittedArticle) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        Connection conn = null;

        Article a = new Article();

        try {
            conn = DriverManager.getConnection(url);

            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO " +
                    "news.news_articles(link, headline, category, short_description, authors, pub_date) " +
                    "VALUES (?, ?, ?, ?, ?, ?)"
            );

            pstmt.setString(1, submittedArticle.getLink());
            pstmt.setString(2, submittedArticle.getHeadline());
            pstmt.setString(3, submittedArticle.getCategory());
            pstmt.setString(4, submittedArticle.getShort_description());
            pstmt.setString(5, submittedArticle.getAuthors());
            pstmt.setDate(6, submittedArticle.getDate());

            pstmt.executeQuery();

            a.setLink(submittedArticle.getLink());
            a.setHeadline(submittedArticle.getHeadline());
            a.setCategory(submittedArticle.getCategory());
            a.setShort_description(submittedArticle.getShort_description());
            a.setAuthors(submittedArticle.getAuthors());
            a.setDate(submittedArticle.getDate());

        } catch (SQLException e) {

            System.out.println("Error connecting to the database");
            e.printStackTrace();

        } finally {

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing the connection");
                e.printStackTrace();
            }

        }

        return a;
    }
}
