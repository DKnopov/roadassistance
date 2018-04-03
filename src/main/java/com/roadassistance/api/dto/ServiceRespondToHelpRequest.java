package com.roadassistance.api.dto;

public class ServiceRespondToHelpRequest {
    String problemId;
    String garageId;
    int price;

    public ServiceRespondToHelpRequest(String problemId, String garageId, int price) {
        this.problemId = problemId;
        this.garageId = garageId;
        this.price = price;
    }

    public ServiceRespondToHelpRequest() {
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    public String getGarageId() {
        return garageId;
    }

    public void setGarageId(String garageId) {
        this.garageId = garageId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
