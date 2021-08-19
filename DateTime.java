import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateTime {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d&MM&yyyy");

    public static LocalDate convert(String date) {
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }

    public static String convert(LocalDate localDate){
        String date = localDate.format(formatter);
        return date;
    }

}

