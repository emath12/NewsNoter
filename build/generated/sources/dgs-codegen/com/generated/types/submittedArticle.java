package com.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.sql.Date;

public class submittedArticle {
  private String link;

  private String headline;

  private String category;

  private String short_description;

  private String authors;

  private Date date;

  public submittedArticle() {
  }

  public submittedArticle(String link, String headline, String category, String short_description,
      String authors, Date date) {
    this.link = link;
    this.headline = headline;
    this.category = category;
    this.short_description = short_description;
    this.authors = authors;
    this.date = date;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getShort_description() {
    return short_description;
  }

  public void setShort_description(String short_description) {
    this.short_description = short_description;
  }

  public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "submittedArticle{" + "link='" + link + "'," +"headline='" + headline + "'," +"category='" + category + "'," +"short_description='" + short_description + "'," +"authors='" + authors + "'," +"date='" + date + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        submittedArticle that = (submittedArticle) o;
        return java.util.Objects.equals(link, that.link) &&
                            java.util.Objects.equals(headline, that.headline) &&
                            java.util.Objects.equals(category, that.category) &&
                            java.util.Objects.equals(short_description, that.short_description) &&
                            java.util.Objects.equals(authors, that.authors) &&
                            java.util.Objects.equals(date, that.date);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(link, headline, category, short_description, authors, date);
  }

  public static com.generated.types.submittedArticle.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String link;

    private String headline;

    private String category;

    private String short_description;

    private String authors;

    private Date date;

    public submittedArticle build() {
                  com.generated.types.submittedArticle result = new com.generated.types.submittedArticle();
                      result.link = this.link;
          result.headline = this.headline;
          result.category = this.category;
          result.short_description = this.short_description;
          result.authors = this.authors;
          result.date = this.date;
                      return result;
    }

    public com.generated.types.submittedArticle.Builder link(String link) {
      this.link = link;
      return this;
    }

    public com.generated.types.submittedArticle.Builder headline(String headline) {
      this.headline = headline;
      return this;
    }

    public com.generated.types.submittedArticle.Builder category(String category) {
      this.category = category;
      return this;
    }

    public com.generated.types.submittedArticle.Builder short_description(
        String short_description) {
      this.short_description = short_description;
      return this;
    }

    public com.generated.types.submittedArticle.Builder authors(String authors) {
      this.authors = authors;
      return this;
    }

    public com.generated.types.submittedArticle.Builder date(Date date) {
      this.date = date;
      return this;
    }
  }
}
