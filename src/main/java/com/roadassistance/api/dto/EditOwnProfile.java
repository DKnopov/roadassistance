package com.roadassistance.api.dto;

public class EditOwnProfile {
	String name;
	String surname;
	String phone;
	String userPhoto;
	UserVehicles[] userVehicles;

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public UserVehicles[] getUserVehicles() {
		return userVehicles;
	}

	public void setUserVehicles(UserVehicles[] userVehicles) {
		this.userVehicles = userVehicles;
	}

	public EditOwnProfile(String name, String surname, String phone, String userPhoto, UserVehicles[] userVehicles) {

		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.userPhoto = userPhoto;
		this.userVehicles = userVehicles;
	}

	public EditOwnProfile() {
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
	
}