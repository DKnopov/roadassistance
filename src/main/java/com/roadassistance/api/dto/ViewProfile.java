package com.roadassistance.api.dto;

public class ViewProfile {
	long userId;
	String name;
	String surname;
	String phone;
	Feedback[] feedback;

	public ViewProfile(long userId, String name, String surname, String phone, Feedback[] feedback) {
		this.userId = userId;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.feedback = feedback;
	}

	public ViewProfile() {
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Feedback[] getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback[] feedback) {
		this.feedback = feedback;
	}

}
