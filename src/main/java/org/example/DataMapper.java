package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.BudgetData;
import org.example.model.BudgetOrganization;
import org.example.model.Info;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataMapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
    private static final DateTimeFormatter DATE_ONLY_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static BudgetOrganization toEntity(BudgetData budgetData) {
        BudgetOrganization entity = new BudgetOrganization();

        // Основные поля
        entity.setId(budgetData.getId());

        if (budgetData.getInfo() != null) {
            Info info = budgetData.getInfo();

            // Основная информация
            entity.setRegNum(info.getRegNum());
            entity.setCode(info.getCode());
            entity.setFullName(info.getFullName());
            entity.setShortName(info.getShortName());
            entity.setInn(info.getInn());
            entity.setKpp(info.getKpp());
            entity.setOgrn(info.getOgrn());

            // Адрес
            entity.setPostIndex(info.getPostIndex());
            entity.setRegionName(info.getRegionName());
            entity.setAreaName(info.getAreaName());
            entity.setCityName(info.getCityName());
            entity.setStreetName(info.getStreetName());
            entity.setHouse(info.getHouse());

            // Классификаторы
            entity.setOktmoCode(info.getOktmoCode());
            entity.setOktmoName(info.getOktmoName());
            entity.setOkopfCode(info.getOkopfCode());
            entity.setOkopfName(info.getOkopfName());
            entity.setOksmCode(info.getOksmCode());
            entity.setOksmName(info.getOksmName());

            // Бюджетная информация
            entity.setBudgetLvlCode(info.getBudgetLvlCode());
            entity.setBudgetLvlName(info.getBudgetLvlName());
            entity.setBudgetCode(info.getBudgetCode());
            entity.setBudgetName(info.getBudgetName());
            entity.setKbkCode(info.getKbkCode());
            entity.setKbkName(info.getKbkName());

            // Статус и даты
            entity.setStatusCode(info.getStatusCode());
            entity.setStatusName(info.getStatusName());
            entity.setRegDate(info.getRegDate());
            entity.setStartDate(info.getStartDate());
            entity.setEndDate(info.getEndDate());
            entity.setLoadDate(info.getLoadDate());

            // Дополнительные поля
            entity.setOrfkCode(info.getOrfkCode());
            entity.setOrfkName(info.getOrfkName());
            entity.setIsOGV(info.getIsOGV());
            entity.setIsObosob(info.getIsObosob());
        }

        // Вложенные структуры как JSON
        try {
            if (budgetData.getActivities() != null) {
                entity.setActivitiesJson(objectMapper.writeValueAsString(budgetData.getActivities()));
            }
            /*if (budgetData.getHeads() != null) {
                entity.setHeadsJson(objectMapper.writeValueAsString(budgetData.getHeads()));
            }
            if (budgetData.getSuccessions() != null) {
                entity.setSuccessionsJson(objectMapper.writeValueAsString(budgetData.getSuccessions()));
            }
            if (budgetData.getFacialAccounts() != null) {
                entity.setFacialAccountsJson(objectMapper.writeValueAsString(budgetData.getFacialAccounts()));
            }
            if (budgetData.getContacts() != null) {
                entity.setContactsJson(objectMapper.writeValueAsString(budgetData.getContacts()));
            }
            if (budgetData.getNonParticipantPermissions() != null) {
                entity.setNonParticipantPermissionsJson(objectMapper.writeValueAsString(budgetData.getNonParticipantPermissions()));
            }*/
        } catch (JsonProcessingException e) {
            System.err.println("Error converting nested objects to JSON: " + e.getMessage());
        }

        return entity;
    }

    private static LocalDateTime parseDateTime(String dateStr) {
        if (dateStr == null || dateStr.isEmpty() || dateStr.equals("null")) {
            return null;
        }
        try {
            return LocalDateTime.parse(dateStr, DATE_FORMATTER);
        } catch (Exception e) {
            try {
                // Попробуем парсить только дату
                return LocalDate.parse(dateStr.substring(0, 10), DATE_ONLY_FORMATTER).atStartOfDay();
            } catch (Exception ex) {
                System.err.println("Error parsing date: " + dateStr);
                return null;
            }
        }
    }
}