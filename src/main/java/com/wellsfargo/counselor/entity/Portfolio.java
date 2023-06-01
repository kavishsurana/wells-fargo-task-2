package com.wellsfargo.counselor.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private Date CreationDate;

    @Column(nullable = false)
    private long clientId;

    public Portfolio(Date creationDate, long clientId) {
        CreationDate = creationDate;
        this.clientId = clientId;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public long getClientId() {
        return clientId;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }
    
    
}
