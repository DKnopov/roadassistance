package com.roadassistance.api.dto;

import org.bson.types.ObjectId;

public class GetProblemsByFilter {

    String problemId;
    String requestingUserPhone;
    int problemType;
    String description;
    Location geoLocation;
    double direction;
    int status;
    int extra;


    public GetProblemsByFilter(String problemId, String requestingUserPhone, int problemType, String description, Location geoLocation, double direction, int status, int extra) {
        this.problemId = problemId;
        this.requestingUserPhone = requestingUserPhone;
        this.problemType = problemType;
        this.description = description;
        this.geoLocation = geoLocation;
        this.direction = direction;
        this.status = status;
        this.extra = extra;
    }

    public GetProblemsByFilter() {

    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    public String getRequestingUserId() {
        return requestingUserPhone;
    }

    public void setRequestingUserId(String requestingUserPhone) {
        this.requestingUserPhone = requestingUserPhone;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }


}
