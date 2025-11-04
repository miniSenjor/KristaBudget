package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Organizations")
public class BudgetOrganization extends Info{
    @Id
    private int id;





    // JSON поля для вложенных структур
    @Column(name = "activities_json", columnDefinition = "TEXT")
    private String activitiesJson;

    @Column(name = "heads_json", columnDefinition = "TEXT")
    private String headsJson;

    @Column(name = "successions_json", columnDefinition = "TEXT")
    private String successionsJson;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivitiesJson() {
        return activitiesJson;
    }

    public void setActivitiesJson(String activitiesJson) {
        this.activitiesJson = activitiesJson;
    }

    public String getHeadsJson() {
        return headsJson;
    }

    public void setHeadsJson(String headsJson) {
        this.headsJson = headsJson;
    }

    public String getSuccessionsJson() {
        return successionsJson;
    }

    public void setSuccessionsJson(String successionsJson) {
        this.successionsJson = successionsJson;
    }
}
