package com.roadassistance.api.dto;

public class Place {
	long placeId;
	String name;
	String type;
	double lat;
	double lng;
	public Place(long placeId, String name, String type, double lat, double lng) {
		this.name = name;
		this.type = type;
		this.lat = lat;
		this.lng = lng;
	}
	public Place() {
	}
	
	public long getPlaceId() {
		return placeId;
	}
	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	

}
