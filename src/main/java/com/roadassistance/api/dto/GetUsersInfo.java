package com.roadassistance.api.dto;

public class GetUsersInfo {
    String email;
    String phone;
    String name;
    String surname;
    String userPhoto;
    UserVehicle userVehicles[];

    public GetUsersInfo(String email, String phone, String name, String surname, String userPhoto, UserVehicle[] userVehicles) {
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.userPhoto = userPhoto;
        this.userVehicles = userVehicles;
    }

    public GetUsersInfo() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public UserVehicle[] getUserVehicles() {
        return userVehicles;
    }

    public void setUserVehicles(UserVehicle[] userVehicles) {
        this.userVehicles = userVehicles;
    }
}
