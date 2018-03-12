package com.roadassistance.api.dto;

public class EditOwnProfile {
	long userId;
	String name;
	String surname;
	String phone;
	String userPhoto;
	UserVehicle[] userVehicles;

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public UserVehicle[] getUserVehicles() {
		return userVehicles;
	}

	public void setUserVehicles(UserVehicle[] userVehicles) {
		this.userVehicles = userVehicles;
	}

	public EditOwnProfile(long userId, String name, String surname, String phone, String userPhoto, UserVehicle[] userVehicles) {
		this.userId = userId;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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