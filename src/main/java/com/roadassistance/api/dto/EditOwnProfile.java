package com.roadassistance.api.dto;

public class EditOwnProfile {
	String name;
	String surname;
	String phone;
	public EditOwnProfile(String name, String surname, String phone) {
		this.name = name;
		this.surname = surname;
		this.phone = phone;
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