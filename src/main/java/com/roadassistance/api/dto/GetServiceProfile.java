package com.roadassistance.api.dto;

public class GetServiceProfile {
    String email;
    String phone;
    String name;
    double rating;
    Feedback[] feedback;
    double distance;

    public GetServiceProfile(String email, String phone, String name, double rating, Feedback[] feedback, double distance) {
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.rating = rating;
        this.feedback = feedback;
        this.distance = distance;
    }

    public GetServiceProfile() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Feedback[] getFeedback() {
        return feedback;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setFeedback(Feedback[] feedback) {
        this.feedback = feedback;
    }
}
