package com.roadassistance.api.dto;

public class Feedback {
    long userId;
    long reviewerId;
    String comment;
    byte estimate;     // оценка пользователя
    String problemId;


    public Feedback(long userId, long reviewerId, String comment, byte estimate, String problemId) {
        this.userId = userId;
        this.reviewerId = reviewerId;
        this.comment = comment;
        this.estimate = estimate;
        this.problemId = problemId;
    }

    public Feedback() {
    }

    public byte getEstimate() {
        return estimate;
    }

    public void setEstimate(byte estimate) {
        this.estimate = estimate;
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

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }
}
