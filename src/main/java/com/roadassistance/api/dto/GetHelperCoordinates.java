package com.roadassistance.api.dto;

public class GetHelperCoordinates {
	long userId;
	Location geoLocation;
	double direction;

	public GetHelperCoordinates(long userId, double lat, double lng, double direction) {
		this.userId = userId;
		this.geoLocation = new Location(lng, lat);
		this.direction = direction;
	}
	public GetHelperCoordinates() {
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
