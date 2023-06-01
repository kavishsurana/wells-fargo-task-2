package com.wellsfargo.counselor.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Securities {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private Time purchaseTime;

    @Column(nullable = false)
    private Number quantity;

    public Securities(long portfolioId, String name, String category, Date purchaseDate, Time purchaseTime,
            Number quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchaseTime(Time purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Time getPurchaseTime() {
        return purchaseTime;
    }

    public Number getQuantity() {
        return quantity;
    }

    

}
