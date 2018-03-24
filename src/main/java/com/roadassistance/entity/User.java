package com.roadassistance.entity;

import com.roadassistance.api.dto.Feedback;
import com.roadassistance.api.dto.Location;
import com.roadassistance.api.dto.UserVehicle;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "user")
public class User implements Serializable {
    @Id
    String userId;
    String email;
    String phone;
    String name;
    String surname;
    Feedback[] feedbacks;
    Location geoLocation;
    double direction;
    UserVehicle[] userVehicles;
    String userPhoto;
    double rating;
    int countEstimates;
    String password;


    public User() {
    }

    public User(String userId, String email, String phone, String name, String surname, Feedback[] feedbacks, Location geoLocation, double direction, UserVehicle[] userVehicles, String userPhoto, double rating, int countEstimates, String password) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.feedbacks = feedbacks;
        this.geoLocation = geoLocation;
        this.direction = direction;
        this.userVehicles = userVehicles;
        this.userPhoto = userPhoto;
        this.rating = rating;
        this.countEstimates = countEstimates;
        this.password = password;
    }

    public User(String userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public int getCountEstimates() {
        return countEstimates;
    }

    public void setCountEstimates(int countEstimates) {
        this.countEstimates = countEstimates;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Feedback[] getFeedbacks() {
        return feedbacks;
    }


    public void setFeedbacks(Feedback[] feedbacks) {
        this.feedbacks = feedbacks;
    }


    public Location getGeoLocation() {
        return geoLocation;
    }


    public void setGeoLocation(Location geoLocation) {
        this.geoLocation = geoLocation;
    }


    public double getDirection() {
        return direction;
    }


    public void setDirection(double direction) {
        this.direction = direction;
    }


    public UserVehicle[] getUserVehicles() {
        return userVehicles;
    }


    public void setUserVehicles(UserVehicle[] userVehicles) {
        this.userVehicles = userVehicles;
    }


    public String getUserPhoto() {
        return userPhoto;
    }


    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }


    public double getRating() {
        return rating;
    }


    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
