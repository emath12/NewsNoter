package com.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ArticleFilter {
  private String title;

  private String author;

  public ArticleFilter() {
  }

  public ArticleFilter(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "ArticleFilter{" + "title='" + title + "'," +"author='" + author + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleFilter that = (ArticleFilter) o;
        return java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(author, that.author);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(title, author);
  }

  public static com.generated.types.ArticleFilter.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String title;

    private String author;

    public ArticleFilter build() {
                  com.generated.types.ArticleFilter result = new com.generated.types.ArticleFilter();
                      result.title = this.title;
          result.author = this.author;
                      return result;
    }

    public com.generated.types.ArticleFilter.Builder title(String title) {
      this.title = title;
      return this;
    }

    public com.generated.types.ArticleFilter.Builder author(String author) {
      this.author = author;
      return this;
    }
  }
}
