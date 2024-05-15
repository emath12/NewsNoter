package com.generated.datafetchers;

import com.generated.types.Article;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class ArticlesDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "articles"
  )
  public List<Article> getArticles(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
