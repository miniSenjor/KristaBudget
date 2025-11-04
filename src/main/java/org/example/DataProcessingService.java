package org.example;

import org.example.model.BudgetData;
import org.example.model.BudgetOrganization;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataProcessingService {
    private final ApiClient apiClient;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public DataProcessingService() {
        this.apiClient = new ApiClient();
    }

    public void processData(LocalDate minDate, LocalDate maxDate) {
        /*LocalDate minDate = LocalDate.parse(minDateStr, DATE_FORMATTER);
        LocalDate maxDate = LocalDate.parse(maxDateStr, DATE_FORMATTER);*/

        System.out.println("Starting data processing for period: " + minDate + " - " + maxDate);

        List<BudgetOrganization> allEntities = new ArrayList<>();
        int currentPage = 1;
        int totalPages = 1;

        try {
            // Сначала удаляем старые данные за этот период
            //deleteExistingData(minDate, maxDate);

            // Скачиваем данные постранично
            do {
                System.out.println("Fetching page " + currentPage + " of " + totalPages);

                ApiResponse response = apiClient.fetchData(currentPage, minDate.toString(), maxDate.toString());

                if (response != null && response.getData() != null) {
                    // Преобразуем каждую запись
                    for (BudgetData data : response.getData()) {
                        BudgetOrganization entity = DataMapper.toEntity(data);
                        allEntities.add(entity);
                    }

                    // Сохраняем пачками по 100 записей
                    if (allEntities.size() >= 100) {
                        saveBatch(allEntities);
                        allEntities.clear();
                    }

                    // Обновляем информацию о пагинации
                    if (response.getPagination() != null) {
                        totalPages = response.getPagination().getTotalPages();
                    }
                }

                currentPage++;

                // Небольшая задержка чтобы не перегружать API
                Thread.sleep(200);

            } while (currentPage <= totalPages);

            // Сохраняем оставшиеся записи
            if (!allEntities.isEmpty()) {
                saveBatch(allEntities);
            }

            System.out.println("Data processing completed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                apiClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteExistingData(LocalDate minDate, LocalDate maxDate) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = "DELETE FROM BudgetOrganization WHERE filterMinLoadDate = :minDate AND filterMaxLoadDate = :maxDate";
            int deletedCount = session.createQuery(hql)
                    .setParameter("minDate", minDate)
                    .setParameter("maxDate", maxDate)
                    .executeUpdate();

            transaction.commit();
            System.out.println("Deleted " + deletedCount + " existing records for period: " + minDate + " - " + maxDate);

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    private void saveBatch(List<BudgetOrganization> entities) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            for (BudgetOrganization entity : entities) {
                session.saveOrUpdate(entity);
            }

            transaction.commit();
            System.out.println("Saved batch of " + entities.size() + " records");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}