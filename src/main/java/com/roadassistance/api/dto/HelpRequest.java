package com.roadassistance.api.dto;

public class HelpRequest {
	long requestingUser;
	String problemType;
	String description;
	double lat;
	double lng;
	double direction;
	int status;
	int extra;

	public HelpRequest() {
	}

	public HelpRequest(long requestingUser, String problemType, String description, double lat, double lng, double direction, int status, int extra) {
		this.requestingUser = requestingUser;
		this.problemType = problemType;
		this.description = description;
		this.lat = lat;
		this.lng = lng;
		this.direction = direction;
		this.status = status;
		this.extra = extra;
	}

	public long getRequestingUser() {
		return requestingUser;
	}

	public void setRequestingUser(long requestingUser) {
		this.requestingUser = requestingUser;
	}

	public String getProblemType() {
		return problemType;
	}

	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
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