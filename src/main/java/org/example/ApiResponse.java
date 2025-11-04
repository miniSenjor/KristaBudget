package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.model.BudgetData;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
    @JsonProperty("data")
    private List<BudgetData> data;

    @JsonProperty("pagination")
    private PaginationInfo pagination;

    // геттеры и сеттеры
    public List<BudgetData> getData() { return data; }
    public void setData(List<BudgetData> data) { this.data = data; }

    public PaginationInfo getPagination() { return pagination; }
    public void setPagination(PaginationInfo pagination) { this.pagination = pagination; }
}
