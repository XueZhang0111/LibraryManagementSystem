package edu.iit.cs425.bean;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
public class ArticleAuthor {
    private Integer article_id;
    private Integer author_id;

    public ArticleAuthor() {
    }

    public ArticleAuthor(Integer article_id, Integer author_id) {
        this.article_id = article_id;
        this.author_id = author_id;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    @Override
    public String toString() {
        return "ArticleAuthor{" +
                "article_id=" + article_id +
                ", author_id=" + author_id +
                '}';
    }
}
