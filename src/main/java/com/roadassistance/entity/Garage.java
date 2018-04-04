package com.roadassistance.entity;

import com.roadassistance.api.dto.Feedback;
import com.roadassistance.api.dto.Location;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "garage")
public class Garage implements Serializable {
    @Id
    String garageId;
    String photo;
    String email;
    String address;
    String phone;
    String companyName;
    Location geoLocation;
    double distance;
    String[] brand;
    double rating;
    Feedback[] feedbacks;
    String password;

    public Garage(String garageId, String photo, String email, String address, String phone, String companyName, Location geoLocation, double distance, String[] brand, double rating, Feedback[] feedbacks, String password) {
        this.garageId = garageId;
        this.photo = photo;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.companyName = companyName;
        this.geoLocation = geoLocation;
        this.distance = distance;
        this.brand = brand;
        this.rating = rating;
        this.feedbacks = feedbacks;
        this.password = password;
    }

    public Garage(String garageId, String email, String password) {
        this.garageId = garageId;
        this.email = email;
        this.password = password;
    }

    public Garage() {
    }

    public String getGarageId() {
        return garageId;
    }

    public void setGarageId(String garageId) {
        this.garageId = garageId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public String[] getBrand() {
        return brand;
    }

    public void setBrand(String[] brand) {
        this.brand = brand;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Feedback[] getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Feedback[] feedbacks) {
        this.feedbacks = feedbacks;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
