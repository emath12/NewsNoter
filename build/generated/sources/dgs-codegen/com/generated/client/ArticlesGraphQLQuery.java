package com.generated.client;

import com.generated.types.ArticleFilter;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class ArticlesGraphQLQuery extends GraphQLQuery {
  public ArticlesGraphQLQuery(ArticleFilter filter, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (filter != null || fieldsSet.contains("filter")) {
        getInput().put("filter", filter);
    }
  }

  public ArticlesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "articles";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ArticleFilter filter;

    private String queryName;

    public ArticlesGraphQLQuery build() {
      return new ArticlesGraphQLQuery(filter, queryName, fieldsSet);
               
    }

    public Builder filter(ArticleFilter filter) {
      this.filter = filter;
      this.fieldsSet.add("filter");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
