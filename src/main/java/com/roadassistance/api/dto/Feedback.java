package com.roadassistance.api.dto;

public class Feedback {
	String userId;
    String userName;
    String reviewerName;
    String comment;
    int estimate;     // оценка пользователя
    String problemId;

	public Feedback() {
	
	}

	public Feedback(String userName, String reviewerName, String comment, int estimate, String problemId) {
		this.userName = userName;
		this.reviewerName = reviewerName;
		this.comment = comment;
		this.estimate = estimate;
		this.problemId = problemId;
	}

	public Feedback(String userId, String userName, String reviewerName, String comment, int estimate, String problemId) {
		this.userId = userId;
		this.userName = userName;
		this.reviewerName = reviewerName;
		this.comment = comment;
		this.estimate = estimate;
		this.problemId = problemId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
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


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
