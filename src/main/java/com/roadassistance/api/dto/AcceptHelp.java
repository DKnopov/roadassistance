package com.roadassistance.api.dto;

public class AcceptHelp {
	long helperId;
	String problemId;
	public AcceptHelp(long helperId, String problemId) {
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

	public String getProblemId() {
		return problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
}
