package com.roadassistance.api.dto;

public class PushHelperLocation {
	long userId;
	double lat;
	double lng;
	double direction;
	public PushHelperLocation(long userId, double lat, double lng, double direction) {
		this.userId = userId;
		this.lat = lat;
		this.lng = lng;
		this.direction = direction;
	}
	public PushHelperLocation() {
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
	

}
