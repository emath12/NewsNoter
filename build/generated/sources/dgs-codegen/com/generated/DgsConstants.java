package com.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static final String MUTATION_TYPE = "Mutation";

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Articles = "articles";

    public static class ARTICLES_INPUT_ARGUMENT {
      public static final String Filter = "filter";
    }
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddArticle = "addArticle";

    public static class ADDARTICLE_INPUT_ARGUMENT {
      public static final String Article = "article";
    }
  }

  public static class ARTICLE {
    public static final String TYPE_NAME = "Article";

    public static final String Link = "link";

    public static final String Headline = "headline";

    public static final String Category = "category";

    public static final String Short_description = "short_description";

    public static final String Authors = "authors";

    public static final String Date = "date";
  }

  public static class SUBMITTEDARTICLE {
    public static final String TYPE_NAME = "submittedArticle";

    public static final String Link = "link";

    public static final String Headline = "headline";

    public static final String Category = "category";

    public static final String Short_description = "short_description";

    public static final String Authors = "authors";

    public static final String Date = "date";
  }

  public static class ARTICLEFILTER {
    public static final String TYPE_NAME = "ArticleFilter";

    public static final String Title = "title";

    public static final String Author = "author";
  }
}
