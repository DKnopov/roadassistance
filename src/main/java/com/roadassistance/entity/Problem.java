package com.roadassistance.entity;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
@SuppressWarnings("serial")
public class Problem implements Serializable {
	@Id
	long problemId;
	String problemType;
	String description;
	double lat;
	double lng;
	double direction;
	int status;
	int extra;
	long acceptingUserId;
	boolean isSolved;
	LocalDate creationTime;
	
	public Problem() {
	}
	public Problem(long problemId, String problemType, String description, double lat, double lng, double direction,
			int status, int extra, long acceptingUserId, boolean isSolved, LocalDate creationTime) {
		this.problemId = problemId;
		this.problemType = problemType;
		this.description = description;
		this.lat = lat;
		this.lng = lng;
		this.direction = direction;
		this.status = status;
		this.extra = extra;
		this.acceptingUserId = acceptingUserId;
		this.isSolved = isSolved;
		this.creationTime = creationTime;
	}
	public long getProblemId() {
		return problemId;
	}
	public void setProblemId(long problemId) {
		this.problemId = problemId;
	}
	
	public String getProblemType() {
		return problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
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
	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}
	public long getAcceptingUserId() {
		return acceptingUserId;
	}
	public void setAcceptingUserId(long acceptingUserId) {
		this.acceptingUserId = acceptingUserId;
	}
	public boolean isSolved() {
		return isSolved;
	}
	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}
	public LocalDate getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(LocalDate creationTime) {
		this.creationTime = creationTime;
	}
	
	
}
