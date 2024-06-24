package com.example.Repo_Spring01.car;

import jakarta.persistence.*;

@Entity
@Table
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private long serialNumber;

    @Column(nullable = false)
    private double currentPrice;

    public CarEntity(long id, String modelName, long serialNumber, double currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public long getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}


