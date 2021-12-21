package edu.iit.cs425.bean;

/**
 * @description: Define one kind of user
 * @author: Xue Zhang
 * @date: 2021-12-02
 * @version: 1.0
 **/
public class Member extends User{
    private int totalDoc;
    private int allowedDoc;

    public int getTotalDoc() {
        return totalDoc;
    }

    public void setTotalDoc(int totalDoc) {
        this.totalDoc = totalDoc;
    }

    public int getAllowedDoc() {
        return allowedDoc;
    }

    public void setAllowedDoc(int allowedDoc) {
        this.allowedDoc = allowedDoc;
    }

    @Override
    public String toString() {
        return "Member{" +
                "totalDoc=" + totalDoc +
                ", allowedDoc=" + allowedDoc +
                '}';
    }
}
