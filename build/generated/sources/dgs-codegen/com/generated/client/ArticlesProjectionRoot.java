package com.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ArticlesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticlesProjectionRoot() {
    super(null, null, java.util.Optional.of("Article"));
  }

  public ArticlesProjectionRoot<PARENT, ROOT> link() {
    getFields().put("link", null);
    return this;
  }

  public ArticlesProjectionRoot<PARENT, ROOT> headline() {
    getFields().put("headline", null);
    return this;
  }

  public ArticlesProjectionRoot<PARENT, ROOT> category() {
    getFields().put("category", null);
    return this;
  }

  public ArticlesProjectionRoot<PARENT, ROOT> short_description() {
    getFields().put("short_description", null);
    return this;
  }

  public ArticlesProjectionRoot<PARENT, ROOT> authors() {
    getFields().put("authors", null);
    return this;
  }

  public ArticlesProjectionRoot<PARENT, ROOT> date() {
    getFields().put("date", null);
    return this;
  }
}
