package com.roadassistance.api.dto;

public class Location {
    Double longitude;
    Double latitude;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Location() {

    }

    public Location(Double longitude, Double latitude) {

        this.longitude = longitude;
        this.latitude = latitude;
    }
}
