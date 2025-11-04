package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            System.out.print("Введите дату начала загрузки ");
            Scanner sIn = new Scanner(System.in);
            LocalDate filterMinLoadDate, filterMaxLoadDate;

            DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            while (true)
            {
                try {
                    filterMinLoadDate = LocalDate.parse(sIn.nextLine(), DATE_FORMATTER);
                    break;
                } catch (Exception e) {
                    System.out.println("Ошибка ввода даты");
                }
            }
            while(true)
            {
                System.out.print("Введите дату конца загрузки ");
                try {
                    filterMaxLoadDate = LocalDate.parse(sIn.nextLine(), DATE_FORMATTER);
                    if (!(filterMaxLoadDate.isBefore(filterMinLoadDate)))
                        break;
                    else
                        throw new Exception("Ошибка! Дата конца загрузки должна быть больше начала");
                }
                catch (ParseException e) {
                    System.out.println("Ошибка ввода даты");
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }


            DataProcessingService service = new DataProcessingService();
            service.processData(filterMinLoadDate, filterMaxLoadDate);

            URL url = new URL("https://budget.gov.ru/epbs/registry/ubpandnubp/data");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            System.out.println("Код ответа: " + responseCode);
            if (responseCode==200){
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream())
                );
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // 5. Выведи результат (это JSON)
                System.out.println("Ответ от API:");
                System.out.println(response.toString());
            }
            con.disconnect();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}