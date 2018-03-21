package com.roadassistance.api.dto;

public class Feedback {
    String userPhone;
    String reviewerPhone;
    String comment;
    int estimate;     // оценка пользователя
    String problemId;

	public Feedback() {
	
	}

	public Feedback(String userPhone, String reviewerPhone, String comment, int estimate, String problemId) {
		this.userPhone = userPhone;
		this.reviewerPhone = reviewerPhone;
		this.comment = comment;
		this.estimate = estimate;
		this.problemId = problemId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getReviewerPhone() {
		return reviewerPhone;
	}

	public void setReviewerPhone(String reviewerPhone) {
		this.reviewerPhone = reviewerPhone;
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
