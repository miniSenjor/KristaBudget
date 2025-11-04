package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BudgetData {
    @JsonProperty("id")
    private int id;

    @JsonProperty("info")
    private Info info;

    @JsonProperty("activities")
    private List<Activity> activities;

    /*@JsonProperty("heads")
    private List<Head> heads;

    @JsonProperty("successions")
    private List<Succession> successions;

    @JsonProperty("facialAccounts")
    private List<FacialAccount> facialAccounts;

    @JsonProperty("contacts")
    private List<Contact> contacts;

    @JsonProperty("nonParticipantPermissions")
    private List<NonParticipantPermission> nonParticipantPermissions;*/

    // геттеры и сеттеры
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Info getInfo() { return info; }
    public void setInfo(Info info) { this.info = info; }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    //public List<Activity> getActivities() { return activities; }
    //public void setActivities(List<Activity> activities) { this.activities = activities; }

    // ... остальные геттеры/сеттеры
}
