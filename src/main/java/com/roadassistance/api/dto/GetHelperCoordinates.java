package com.roadassistance.api.dto;

public class GetHelperCoordinates {
	String userPhone;
	Location geoLocation;
	double direction;
	public GetHelperCoordinates(String userPhone, Location geoLocation, double direction) {
		super();
		this.userPhone = userPhone;
		this.geoLocation = geoLocation;
		this.direction = direction;
	}
	public GetHelperCoordinates() {
	
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
