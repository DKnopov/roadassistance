package com.roadassistance.api.dto;

public class RespondToHelpRequest {
	String problemId;
	long userId;
	Location geoLocation;
	double direction;

	public RespondToHelpRequest(String problemId, long userId, Location geoLocation, double direction) {
		this.problemId = problemId;
		this.userId = userId;
		this.geoLocation = geoLocation;
		this.direction = direction;
	}

	public RespondToHelpRequest() {
	}

	public String getProblemId() {
		return problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
	
	

}
