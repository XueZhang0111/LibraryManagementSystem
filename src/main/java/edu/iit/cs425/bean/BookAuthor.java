package edu.iit.cs425.bean;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
public class BookAuthor {
    private Integer book_id;
    private Integer author_id;

    public BookAuthor() {
    }

    public BookAuthor(Integer book_id, Integer author_id) {
        this.book_id = book_id;
        this.author_id = author_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "book_id=" + book_id +
                ", author_id=" + author_id +
                '}';
    }
}
