package com.roadassistance.api.dto;

public class EditOwnProfile {
	String name;
	String surname;
	String phone;
	String userPhoto;
	UserVehicle[] userVehicle;

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public UserVehicle[] getUserVehicles() {
		return userVehicle;
	}

	public void setUserVehicles(UserVehicle[] userVehicles) {
		this.userVehicle = userVehicles;
	}

	public EditOwnProfile(String name, String surname, String phone, String userPhoto, UserVehicle[] userVehicles) {

		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.userPhoto = userPhoto;
		this.userVehicle = userVehicles;
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