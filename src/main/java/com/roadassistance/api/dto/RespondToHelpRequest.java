package com.roadassistance.api.dto;

public class RespondToHelpRequest {
	String problemId;
	String userPhone;
	Location geoLocation;
	double direction;
	public RespondToHelpRequest(String problemId, String userPhone, Location geoLocation, double direction) {
		super();
		this.problemId = problemId;
		this.userPhone = userPhone;
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
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
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
