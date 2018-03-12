package com.roadassistance.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.roadassistance.api.dto.Location;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;


@Document(collection = "problem")
public class Problem implements Serializable {

    @Id
    String problemId;
    long requestingUserId;
    int problemType;
    String description;
    Location geoLocation;
    double direction;
    int status;
    int extra;
    long acceptingUserId;
    boolean isSolved;
    LocalDateTime creationTime;

    public Problem() {
    }


    public Problem(String problemId, long requestingUserId, int problemType, String description, Location geoLocation, double direction, int status, int extra, long acceptingUserId, boolean isSolved, LocalDateTime creationTime) {
        this.problemId = problemId;
        this.requestingUserId = requestingUserId;
        this.problemType = problemType;
        this.description = description;
        this.geoLocation = geoLocation;
        this.direction = direction;
        this.status = status;
        this.extra = extra;
        this.acceptingUserId = acceptingUserId;
        this.isSolved = isSolved;
        this.creationTime = creationTime;
    }

    public long getRequestingUserId() {
        return requestingUserId;
    }

    public void setRequestingUserId(long requestingUserId) {
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

    public long getAcceptingUserId() {
        return acceptingUserId;
    }

    public void setAcceptingUserId(long acceptingUserId) {
        this.acceptingUserId = acceptingUserId;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }
}
