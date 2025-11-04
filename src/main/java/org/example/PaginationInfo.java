package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginationInfo {
    @JsonProperty("currentPage")
    private int currentPage;

    @JsonProperty("totalPages")
    private int totalPages;

    @JsonProperty("totalCount")
    private int totalCount;

    // геттеры и сеттеры
    public int getCurrentPage() { return currentPage; }
    public void setCurrentPage(int currentPage) { this.currentPage = currentPage; }

    public int getTotalPages() { return totalPages; }
    public void setTotalPages(int totalPages) { this.totalPages = totalPages; }

    public int getTotalCount() { return totalCount; }
    public void setTotalCount(int totalCount) { this.totalCount = totalCount; }
}