package com.roadassistance.api.dto;

public class CreateServiceAuth {
    String email;
    String password;

    public CreateServiceAuth(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public CreateServiceAuth() {
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
