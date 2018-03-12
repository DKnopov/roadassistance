package com.roadassistance.api.dto;

import org.bson.types.ObjectId;

public class GetProblemsByFilter {

    String problemId;
    long requestingUserId;
    int problemType;
    String description;
    Location geoLocation;
    double direction;
    int status;
    int extra;


    public GetProblemsByFilter(String problemId, long requestingUserId, int problemType, String description, Location geoLocation, double direction, int status, int extra) {
        this.problemId = problemId;
        this.requestingUserId = requestingUserId;
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

    public long getRequestingUserId() {
        return requestingUserId;
    }

    public void setRequestingUserId(long requestingUserId) {
        this.requestingUserId = requestingUserId;
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
