package org.example;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ApiClient {
    private static final String BASE_URL = "https://budget.gov.ru/epbs/registry/ubpandnubp/data";
    private final CloseableHttpClient httpClient;
    private final ObjectMapper objectMapper;

    public ApiClient() {
        this.httpClient = HttpClients.createDefault();
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Автоматическое преобразование snake_case в camelCase
        //this.objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
    }

    public ApiResponse fetchData(int page, String minDate, String maxDate) throws IOException {
        String url = buildUrl(page, minDate, maxDate);
        System.out.println("Fetching: " + url);

        HttpGet request = new HttpGet(url);

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new IOException("HTTP error: " + statusCode + " for URL: " + url);
            }

            String jsonResponse = EntityUtils.toString(response.getEntity());
            return objectMapper.readValue(jsonResponse, ApiResponse.class);
        }
    }

    private String buildUrl(int page, String minDate, String maxDate) {
        StringBuilder urlBuilder = new StringBuilder(BASE_URL);
        urlBuilder.append("?page=").append(page);

        if (minDate != null && !minDate.isEmpty()) {
            urlBuilder.append("&filterminloaddate=").append(minDate);
        }

        if (maxDate != null && !maxDate.isEmpty()) {
            urlBuilder.append("&filtermaxloaddate=").append(maxDate);
        }

        return urlBuilder.toString();
    }

    public void close() throws IOException {
        httpClient.close();
    }
}