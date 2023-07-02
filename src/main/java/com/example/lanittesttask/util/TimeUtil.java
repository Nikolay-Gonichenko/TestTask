package com.example.lanittesttask.util;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeUtil {

    public static String convertDate(String inputDate) {
        LocalDateTime dateTime = LocalDateTime.parse(inputDate, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        LocalDateTime modifiedDateTime = dateTime.plusYears(1).plusMonths(1).plusDays(1);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm");
        String outputTime = modifiedDateTime.format(outputFormatter);
        return outputTime;
    }

    public static String getCurrentTime() {
        OffsetDateTime currentTime = OffsetDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        String formattedTime = currentTime.format(formatter);

        LocalDateTime dateTime = LocalDateTime.parse(formattedTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String outputTime = dateTime.format(outputFormatter);
        return outputTime;
    }
}
