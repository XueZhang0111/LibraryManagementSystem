package edu.iit.cs425.bean;

import java.sql.Date;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
public class BR {
    private Integer member_id;
    private Integer barcode;
    private Integer document_id;
    private String transaction_type;
    private Date transaction_date;
    private Date due_date;

    public BR() {
    }

    public BR(Integer member_id, Integer barcode, Integer document_id, String transaction_type, Date transaction_date, Date due_date) {
        this.member_id = member_id;
        this.barcode = barcode;
        this.document_id = document_id;
        this.transaction_type = transaction_type;
        this.transaction_date = transaction_date;
        this.due_date = due_date;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }

    public Integer getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Integer document_id) {
        this.document_id = document_id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    @Override
    public String toString() {
        return "BR{" +
                "member_id=" + member_id +
                ", barcode=" + barcode +
                ", document_id=" + document_id +
                ", transaction_type='" + transaction_type + '\'' +
                ", transaction_date=" + transaction_date +
                ", due_date=" + due_date +
                '}';
    }
}
