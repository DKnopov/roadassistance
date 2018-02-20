package com.roadassistance.api.dto;

public class HelpRequest {
	long requestingUser;
	long acceptingUser;
	int problemType;
	int answer;
	String description;
	double lat;
	double lng;
	double direction;
	int status;
	
	public HelpRequest(long requestingUser, long acceptingUser, int problemType, int answer, String description,
			double lat, double lng, double direction, int status) {
		super();
		this.requestingUser = requestingUser;
		this.acceptingUser = acceptingUser;
		this.problemType = problemType;
		this.answer = answer;
		this.description = description;
		this.lat = lat;
		this.lng = lng;
		this.direction = direction;
		this.status = status;
	}
	
	public HelpRequest() {
		super();
	}

	public long getRequestingUser() {
		return requestingUser;
	}
	public void setRequestingUser(long requestingUser) {
		this.requestingUser = requestingUser;
	}
	public long getAcceptingUser() {
		return acceptingUser;
	}
	public void setAcceptingUser(long acceptingUser) {
		this.acceptingUser = acceptingUser;
	}
	public int getProblemType() {
		return problemType;
	}
	public void setProblemType(int problemType) {
		this.problemType = problemType;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
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
	

}