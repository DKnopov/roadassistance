package com.roadassistance.api.dto;

public class AcceptHelp {
	String helperPhone;
	String problemId;
	public AcceptHelp(String helperPhone, String problemId) {
		this.helperPhone = helperPhone;
		this.problemId = problemId;
	}
	public AcceptHelp() {
		
	}
	public String getHelperPhone() {
		return helperPhone;
	}
	public void setHelperPhone(String helperPhone) {
		this.helperPhone = helperPhone;
	}
	public String getProblemId() {
		return problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}

	
	
}
