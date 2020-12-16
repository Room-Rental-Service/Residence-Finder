package com.dbms.Residence.Finder.models;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity

public class Property extends Locality{

    private String name;

    private int price;

    @Column(name = "update_time")
    private Date updateTime;

    private BigDecimal rating;

    private String description;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "availaibility_status")
    private String availaibilityStatus;

    private Byte[] image;

    @Column(name = "existing_people")
    private int existingPeople;

    private int bhk;

    public Property(String longitude, String latitude, String address, String city, String state, String name, int price, Date updateTime, BigDecimal rating, String description, Date registrationDate, String availaibilityStatus, Byte[] image, int existingPeople, int bhk) {
        super(longitude, latitude, address, city, state);
        this.name = name;
        this.price = price;
        this.updateTime = updateTime;
        this.rating = rating;
        this.description = description;
        this.registrationDate = registrationDate;
        this.availaibilityStatus = availaibilityStatus;
        this.image = image;
        this.existingPeople = existingPeople;
        this.bhk = bhk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getAvailaibilityStatus() {
        return availaibilityStatus;
    }

    public void setAvailaibilityStatus(String availaibilityStatus) {
        this.availaibilityStatus = availaibilityStatus;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public int getExistingPeople() {
        return existingPeople;
    }

    public void setExistingPeople(int existingPeople) {
        this.existingPeople = existingPeople;
    }

    public int getBhk() {
        return bhk;
    }

    public void setBhk(int bhk) {
        this.bhk = bhk;
    }
}
