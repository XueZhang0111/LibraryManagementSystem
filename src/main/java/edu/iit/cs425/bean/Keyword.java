package edu.iit.cs425.bean;

/**
 * @description: Keyword entity
 * @author: Xue Zhang
 * @date: 2021-12-09
 * @version: 1.0
 **/
public class Keyword {
    private Integer keyID;
    private String words;

    public Keyword() {
    }

    public Keyword(Integer keyID, String words) {
        this.keyID = keyID;
        this.words = words;
    }

    public Integer getKeyID() {
        return keyID;
    }

    public void setKeyID(Integer keyID) {
        this.keyID = keyID;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "keyID=" + keyID +
                ", words='" + words + '\'' +
                '}';
    }
}
