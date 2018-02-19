package com.roadassistance.api.dto;

public class AcceptHelp {
	long helperId;
	long problemId;
	public AcceptHelp(long helperId, long problemId) {
		this.helperId = helperId;
		this.problemId = problemId;
	}
	public AcceptHelp() {
	}
	public long getHelperId() {
		return helperId;
	}
	public void setHelperId(long helperId) {
		this.helperId = helperId;
	}
	public long getProblemId() {
		return problemId;
	}
	public void setProblemId(long problemId) {
		this.problemId = problemId;
	}
	
}
