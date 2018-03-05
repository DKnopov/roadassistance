package com.roadassistance.entity;

import com.roadassistance.api.dto.Feedback;
import com.roadassistance.api.dto.UserVehicle;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{
    @Id
    long userId;
    String name;
    String surname;
    String phone;
    Feedback[] feedbacks;
    double lat;
    double lng;
    double direction;
    UserVehicle userVehicles;
    String userPhoto;
    double rating;

    public User() {
    }

    public User(long userId, String name, String surname, String phone, Feedback[] feedbacks, double lat, double lng, double direction, UserVehicle userVehicles, String userPhoto, double rating) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.feedbacks = feedbacks;
        this.lat = lat;
        this.lng = lng;
        this.direction = direction;
        this.userVehicles = userVehicles;
        this.userPhoto = userPhoto;
        this.rating = rating;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Feedback[] getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Feedback[] feedbacks) {
        this.feedbacks = feedbacks;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public UserVehicle getUserVehicles() {
        return userVehicles;
    }

    public void setUserVehicles(UserVehicle userVehicles) {
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
}
