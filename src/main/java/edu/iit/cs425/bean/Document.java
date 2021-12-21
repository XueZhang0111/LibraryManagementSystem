package edu.iit.cs425.bean;

/**
 * @description: Document entities
 * @author: Xue Zhang
 * @date: 2021-11-19
 * @version: 1.0
 **/
public class Document {
    private Integer documentID;
    private String title;
    private Integer copyAmount;
    private String type;

    public Document() {
    }

    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCopyAmount() {
        return copyAmount;
    }

    public void setCopyAmount(Integer copyAmount) {
        this.copyAmount = copyAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentID=" + documentID +
                ", title='" + title + '\'' +
                ", copyAmount=" + copyAmount +
                ", type='" + type + '\'' +
                '}';
    }
}
