package com.roadassistance.api.dto;

public class Feedback {
    String userId;
    String reviewerId;
    String comment;
    int estimate;     // оценка пользователя
    String problemId;
	public Feedback(String userId, String reviewerId, String comment, int estimate, String problemId) {
		this.userId = userId;
		this.reviewerId = reviewerId;
		this.comment = comment;
		this.estimate = estimate;
		this.problemId = problemId;
	}
	public Feedback() {
	
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReviewerId() {
		return reviewerId;
	}
	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getEstimate() {
		return estimate;
	}
	public void setEstimate(int estimate) {
		this.estimate = estimate;
	}
	public String getProblemId() {
		return problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	


   
}
