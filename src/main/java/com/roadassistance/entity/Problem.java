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
    String requestingUserPhone;
    int problemType;
    String description;
    Location geoLocation;
    double direction;
    int status;
    int extra;
    String acceptingUserPhone;
    boolean isSolved;
    LocalDateTime creationTime;

    public Problem() {
    }

	public Problem(String problemId, String requestingUserPhone, int problemType, String description,
			Location geoLocation, double direction, int status, int extra, String acceptingUserPhone, boolean isSolved,
			LocalDateTime creationTime) {
		this.problemId = problemId;
		this.requestingUserPhone = requestingUserPhone;
		this.problemType = problemType;
		this.description = description;
		this.geoLocation = geoLocation;
		this.direction = direction;
		this.status = status;
		this.extra = extra;
		this.acceptingUserPhone = acceptingUserPhone;
		this.isSolved = isSolved;
		this.creationTime = creationTime;
	}

	public String getProblemId() {
		return problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}

	public String getRequestingUserPhone() {
		return requestingUserPhone;
	}

	public void setRequestingUserPhone(String requestingUserPhone) {
		this.requestingUserPhone = requestingUserPhone;
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

	public String getAcceptingUserPhone() {
		return acceptingUserPhone;
	}

	public void setAcceptingUserPhone(String acceptingUserPhone) {
		this.acceptingUserPhone = acceptingUserPhone;
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


 
}
