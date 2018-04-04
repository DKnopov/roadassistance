package com.roadassistance.api.dto;

public class HelpRequest {
    String requestingUserId;
    int problemType;
    String description;
    Location geoLocation;
    double direction;
    int extra;
    UserVehicle userVehicle;
    String fbToken;

    public HelpRequest() {
    }

    public HelpRequest(String requestingUserId, int problemType, String description, Location geoLocation, double direction, int extra, UserVehicle userVehicle, String fbToken) {
        this.requestingUserId = requestingUserId;
        this.problemType = problemType;
        this.description = description;
        this.geoLocation = geoLocation;
        this.direction = direction;
        this.extra = extra;
        this.userVehicle = userVehicle;
        this.fbToken = fbToken;
    }

    public String getFbToken() {
        return fbToken;
    }

    public void setFbToken(String fbToken) {
        this.fbToken = fbToken;
    }

    public String getRequestingUserId() {
        return requestingUserId;
    }

    public void setRequestingUserId(String requestingUserId) {
        this.requestingUserId = requestingUserId;
    }

    public int getProblemType() {
        return problemType;
    }

    public void setProblemType(int problemType) {
        this.problemType = problemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public UserVehicle getUserVehicle() {
        return userVehicle;
    }

    public void setUserVehicle(UserVehicle userVehicle) {
        this.userVehicle = userVehicle;
    }
}