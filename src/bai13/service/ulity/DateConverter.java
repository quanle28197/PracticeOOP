package bai13.service.ulity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {
    public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");

    public static LocalDate stringToDate(String st) {
        return LocalDate.parse(st, fmt1);
    }

    public static String dateToString(LocalDate date) {
        return date.format(fmt1);
    }
}
