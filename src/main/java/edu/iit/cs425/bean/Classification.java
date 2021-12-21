package edu.iit.cs425.bean;

/**
 * @description: Classification entity
 * @author: Xue Zhang
 * @date: 2021-12-09
 * @version: 1.0
 **/
public class Classification {

    private Integer classID;
    private String phrase;

    public Classification() {
    }

    public Classification(Integer classID, String phrase) {
        this.classID = classID;
        this.phrase = phrase;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public String toString() {
        return "Classification{" +
                "classID=" + classID +
                ", phrase='" + phrase + '\'' +
                '}';
    }
}
