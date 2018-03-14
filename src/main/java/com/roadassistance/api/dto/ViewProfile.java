package com.roadassistance.api.dto;

public class ViewProfile {
	String phone;
	String name;
	String surname;
	double rating;
	Feedback[] feedback;
	public ViewProfile() {

	}
	public ViewProfile(String phone, String name, String surname, double rating, Feedback[] feedback) {
		super();
		this.phone = phone;
		this.name = name;
		this.surname = surname;
		this.rating = rating;
		this.feedback = feedback;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Feedback[] getFeedback() {
		return feedback;
	}
	public void setFeedback(Feedback[] feedback) {
		this.feedback = feedback;
	}
	
	


}
