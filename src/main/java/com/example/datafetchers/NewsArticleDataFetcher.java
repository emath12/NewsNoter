package com.example.datafetchers;

import com.generated.types.Article;
import com.generated.types.ArticleFilter;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import org.json.JSONObject;

@DgsComponent
public class NewsArticleDataFetcher {

    @DgsQuery
    public List<Article> articles(@InputArgument("filter") ArticleFilter filter) {

        File jsonFile = new File("News_Category_Dataset_v3.json");

//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            List<Article> articles = mapper.readValue(jsonFile, new TypeReference<List<Article>>() {});
//            articles.forEach(article -> System.out.println(article.getHeadline()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("Filter: " + filter);

        String link = "https://www.example.com";
        String headline = "Breaking News: Java Simplified";
        String category = "Technology";
        String shortDescription = "A quick overview of new features in Java.";
        List<String> authors = Arrays.asList("John Doe", "Jane Smith");
        OffsetDateTime date = OffsetDateTime.now();

        Article article = new Article(link, headline, category, shortDescription, authors, date);

        System.out.println("Article: " + article.getHeadline());

        return Arrays.asList(article, article);
    }
}
