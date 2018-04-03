package com.roadassistance.api.dto;

public class EditServiceProfile {
    String garageId;
    String email;
    String address;
    String phone;
    String companyName;
    double rating;
    Location geoLocation;
    double distance;
    String brand;

    public EditServiceProfile(String garageId, String email, String address, String phone, String companyName, double rating, Location geoLocation, double distance, String brand) {
        this.garageId = garageId;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.companyName = companyName;
        this.rating = rating;
        this.geoLocation = geoLocation;
        this.distance = distance;
        this.brand = brand;
    }

    public EditServiceProfile() {
    }

    public String getGarageId() {
        return garageId;
    }

    public void setGarageId(String garageId) {
        this.garageId = garageId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Location getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(Location geoLocation) {
        this.geoLocation = geoLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
