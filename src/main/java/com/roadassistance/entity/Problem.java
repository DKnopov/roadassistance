package com.roadassistance.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.roadassistance.api.dto.Location;


@Document(collection = "problem")
public class Problem implements Serializable {

    @Id
    String problemId;
    String requestingUserId;
    int problemType;
    String description;
    Location geoLocation;
    double direction;
    int status;
    int extra;
    String acceptingUserId;
    LocalDateTime creationTime;
    String fbToken;

    public Problem() {
    }

    public Problem(String problemId, String requestingUserId, int problemType, String description, Location geoLocation, double direction, int status, int extra, String acceptingUserId, LocalDateTime creationTime, String fbToken) {
        this.problemId = problemId;
        this.requestingUserId = requestingUserId;
        this.problemType = problemType;
        this.description = description;
        this.geoLocation = geoLocation;
        this.direction = direction;
        this.status = status;
        this.extra = extra;
        this.acceptingUserId = acceptingUserId;
        this.creationTime = creationTime;
        this.fbToken = fbToken;
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public String getRequestingUserId() {
        return requestingUserId;
    }

    public void setRequestingUserId(String requestingUserId) {
        this.requestingUserId = requestingUserId;
    }

    public String getAcceptingUserId() {
        return acceptingUserId;
    }

    public void setAcceptingUserId(String acceptingUserId) {
        this.acceptingUserId = acceptingUserId;
    }


    public void setSolved(boolean isSolved) {
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getFbToken() {
        return fbToken;
    }

    public void setFbToken(String fbToken) {
        this.fbToken = fbToken;
    }
}
