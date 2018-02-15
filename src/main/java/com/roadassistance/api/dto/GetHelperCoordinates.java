package com.roadassistance.api.dto;

public class GetHelperCoordinates {
	long userId;

	public GetHelperCoordinates(long userId) {
		this.userId = userId;
	}

	public GetHelperCoordinates() {
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
