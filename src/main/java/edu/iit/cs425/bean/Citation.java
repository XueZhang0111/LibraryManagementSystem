package edu.iit.cs425.bean;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
public class Citation {
    private Integer article_id;
    private Integer book_id;
    private Integer citation_cnt;

    public Citation() {
    }

    public Citation(Integer article_id, Integer book_id, Integer citation_cnt) {
        this.article_id = article_id;
        this.book_id = book_id;
        this.citation_cnt = citation_cnt;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getCitation_cnt() {
        return citation_cnt;
    }

    public void setCitation_cnt(Integer citation_cnt) {
        this.citation_cnt = citation_cnt;
    }

    @Override
    public String toString() {
        return "Citation{" +
                "article_id=" + article_id +
                ", book_id=" + book_id +
                ", citation_cnt=" + citation_cnt +
                '}';
    }
}
