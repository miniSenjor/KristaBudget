package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity {
    @JsonProperty("activityCode")
    private String activityCode;

    @JsonProperty("activityName")
    private String activityName;

    @JsonProperty("activityKind")
    private String activityKind;

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityKind() {
        return activityKind;
    }

    public void setActivityKind(String activityKind) {
        this.activityKind = activityKind;
    }

    // геттеры и сеттеры
}
