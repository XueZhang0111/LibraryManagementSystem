package edu.iit.cs425.bean;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
public class Author {
    private Integer author_id;
    private String aname;

    public Author() {
    }

    public Author(Integer author_id, String aname) {
        this.author_id = author_id;
        this.aname = aname;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", aname='" + aname + '\'' +
                '}';
    }
}
