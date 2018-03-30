package com.roadassistance.api.dto;

public class GetHelperCoordinates {
	String userId;
	Location geoLocation;
	double direction;

	public GetHelperCoordinates() {
	
	}

	public GetHelperCoordinates(String userId, Location geoLocation, double direction) {
		this.userId = userId;
		this.geoLocation = geoLocation;
		this.direction = direction;
	}

	public Location getGeoLocation() {
		return geoLocation;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
