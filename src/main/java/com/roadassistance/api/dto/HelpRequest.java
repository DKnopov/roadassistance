package com.roadassistance.api.dto;

public class HelpRequest {
	String requestingUserPhone;
	int problemType;
	String description;
	Location geoLocation;
	double direction;
	int status;
	int extra;

	public HelpRequest() {
	}

	public HelpRequest(String requestingUserPhone, int problemType, String description, Location geoLocation,
			double direction, int status, int extra) {
		super();
		this.requestingUserPhone = requestingUserPhone;
		this.problemType = problemType;
		this.description = description;
		this.geoLocation = geoLocation;
		this.direction = direction;
		this.status = status;
		this.extra = extra;
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


}