package com.roadassistance.api.dto;

public class GetHelperCoordinates {
	String userEmail;
	Location geoLocation;
	double direction;
	public GetHelperCoordinates(String userEmail, Location geoLocation, double direction) {
		this.userEmail = userEmail;
		this.geoLocation = geoLocation;
		this.direction = direction;
	}
	public GetHelperCoordinates() {
	
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
