package com.roadassistance.api.dto;

public class Registration {
    String email;
    String password;

    public Registration(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Registration() {
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
}
