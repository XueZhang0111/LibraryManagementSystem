package edu.iit.cs425.bean;

/**
 * @description: Document located in one place.
 * @author: Xue Zhang
 * @date: 2021-12-05
 * @version: 1.0
 **/
public class Location {
    private Integer locationID;
    private Integer shelfID;
    private Integer rowNum;

    public Location() {
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    public Integer getShelfID() {
        return shelfID;
    }

    public void setShelfID(Integer shelfID) {
        this.shelfID = shelfID;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationID=" + locationID +
                ", shelfID=" + shelfID +
                ", rowNum=" + rowNum +
                '}';
    }
}
