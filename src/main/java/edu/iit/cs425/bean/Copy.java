package edu.iit.cs425.bean;

/**
 * @description: Copy entity
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
public class Copy {
    private Integer barcode;
    private Boolean isAvailable;
    private Location location;
    private Document document;

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Copy{" +
                "barcode=" + barcode +
                ", isAvailable=" + isAvailable +
                ", location=" + location +
                ", document=" + document +
                '}';
    }
}
