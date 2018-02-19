package com.roadassistance.api.dto;

public class Feedback {
	long userId;
	long reviewerId;
	String comment;
	int rating;
	long problemId;


	public Feedback(long userId, long reviewerId, String comment, int rating, long problemId) {
		this.userId = userId;
		this.reviewerId = reviewerId;
		this.comment = comment;
		this.rating = rating;
		this.problemId = problemId;
	}

	public Feedback() {
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(long reviewerId) {
		this.reviewerId = reviewerId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public long getProblemId() {
		return problemId;
	}

	public void setProblemId(long problemId) {
		this.problemId = problemId;
	}

}
