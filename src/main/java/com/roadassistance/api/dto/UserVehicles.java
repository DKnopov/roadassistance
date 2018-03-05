package com.roadassistance.api.dto;

public class UserVehicles {
    String brand;
    String model;
    String transmission;

    public UserVehicles() {
    }

    public UserVehicles(String brand, String model, String transmission) {
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
