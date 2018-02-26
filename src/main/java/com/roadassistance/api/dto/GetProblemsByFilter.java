package com.roadassistance.api.dto;

public class GetProblemsByFilter {
	long problemId;
	long requestingUserId;
	long acceptingUserId;
	int problemType;
	String description;
	double lat;
	double lng;
	int status;
	double direction;
	public GetProblemsByFilter(long problemId, long requestingUserId, long acceptingUserId, int problemType,
			String description, double lat, double lng, int status, double direction) {
		this.problemId = problemId;
		this.requestingUserId = requestingUserId;
		this.acceptingUserId = acceptingUserId;
		this.problemType = problemType;
		this.description = description;
		this.lat = lat;
		this.lng = lng;
		this.status = status;
		this.direction = direction;
	}
	public GetProblemsByFilter() {
		
	}
	public long getProblemId() {
		return problemId;
	}
	public void setProblemId(long problemId) {
		this.problemId = problemId;
	}
	public long getRequestingUserId() {
		return requestingUserId;
	}
	public void setRequestingUserId(long requestingUserId) {
		this.requestingUserId = requestingUserId;
	}
	public long getAcceptingUserId() {
		return acceptingUserId;
	}
	public void setAcceptingUserId(long acceptingUserId) {
		this.acceptingUserId = acceptingUserId;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getDirection() {
		return direction;
	}
	public void setDirection(double direction) {
		this.direction = direction;
	}
	
	

}