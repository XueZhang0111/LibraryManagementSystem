package edu.iit.cs425.bean;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
public class Classify {
    private Integer document_id;
    private Integer classification_id;

    public Classify() {
    }

    public Classify(Integer document_id, Integer classification_id) {
        this.document_id = document_id;
        this.classification_id = classification_id;
    }

    public Integer getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Integer document_id) {
        this.document_id = document_id;
    }

    public Integer getClassification_id() {
        return classification_id;
    }

    public void setClassification_id(Integer classification_id) {
        this.classification_id = classification_id;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "document_id=" + document_id +
                ", classification_id=" + classification_id +
                '}';
    }
}
