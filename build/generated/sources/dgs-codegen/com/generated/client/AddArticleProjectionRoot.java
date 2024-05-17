package com.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AddArticleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AddArticleProjectionRoot() {
    super(null, null, java.util.Optional.of("Article"));
  }

  public AddArticleProjectionRoot<PARENT, ROOT> link() {
    getFields().put("link", null);
    return this;
  }

  public AddArticleProjectionRoot<PARENT, ROOT> headline() {
    getFields().put("headline", null);
    return this;
  }

  public AddArticleProjectionRoot<PARENT, ROOT> category() {
    getFields().put("category", null);
    return this;
  }

  public AddArticleProjectionRoot<PARENT, ROOT> short_description() {
    getFields().put("short_description", null);
    return this;
  }

  public AddArticleProjectionRoot<PARENT, ROOT> authors() {
    getFields().put("authors", null);
    return this;
  }

  public AddArticleProjectionRoot<PARENT, ROOT> date() {
    getFields().put("date", null);
    return this;
  }
}
