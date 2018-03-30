package com.roadassistance.api.dto;

public class PushHelperLocation {
	String userId;
	Location geoLocation;
	double direction;

	public PushHelperLocation() {
	}

	public PushHelperLocation(String userId, Location geoLocation, double direction) {
		this.userId = userId;
		this.geoLocation = geoLocation;
		this.direction = direction;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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
