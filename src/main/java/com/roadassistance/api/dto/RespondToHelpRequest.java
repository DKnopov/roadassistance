package com.roadassistance.api.dto;

public class RespondToHelpRequest {
	long promlemId;
	long userId;
	double lat;
	double lng;
	double direction;
	public RespondToHelpRequest(long promlemId, long userId, double lat, double lng, double direction) {
		this.promlemId = promlemId;
		this.userId = userId;
		this.lat = lat;
		this.lng = lng;
		this.direction = direction;
	}
	public RespondToHelpRequest() {
	}
	public long getPromlemId() {
		return promlemId;
	}
	public void setPromlemId(long promlemId) {
		this.promlemId = promlemId;
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
