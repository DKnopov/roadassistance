package com.roadassistance.api.dto;

public class ViewProfile {
	long userId;

	public ViewProfile(long userId) {
		this.userId = userId;
	}

	public ViewProfile() {
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
