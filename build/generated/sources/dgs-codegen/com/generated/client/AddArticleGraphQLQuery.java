package com.generated.client;

import com.generated.types.submittedArticle;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class AddArticleGraphQLQuery extends GraphQLQuery {
  public AddArticleGraphQLQuery(submittedArticle article, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (article != null || fieldsSet.contains("article")) {
        getInput().put("article", article);
    }
  }

  public AddArticleGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "addArticle";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private submittedArticle article;

    private String queryName;

    public AddArticleGraphQLQuery build() {
      return new AddArticleGraphQLQuery(article, queryName, fieldsSet);
               
    }

    public Builder article(submittedArticle article) {
      this.article = article;
      this.fieldsSet.add("article");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
