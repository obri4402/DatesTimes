import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        // How to work with DATES & TIMES
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now(); // LocalDate
        LocalTime time = LocalTime.now(); // LocalTime
        LocalDateTime dateTime = LocalDateTime.now(); // LocalDateAndTime
        Instant instant = Instant.now(); // UTC timestamp

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        // Custom format

        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);

        System.out.println();

        System.out.println("New format of Date and Time:");
        System.out.println(newDateTime);

        LocalDate date1 = LocalDate.of(2025, 12,25);
        System.out.println();
        System.out.println(date1);

        LocalDateTime dateTime2 = LocalDateTime.of(2026, 4, 4, 6,4, 28);
        System.out.println(dateTime2);

        if (date.isBefore(date1)){
            System.out.println(date + " is earlier than " + date1);
        }
        else if (date.isAfter(date1)) {
            System.out.println(date + " is later than " + date1);
        } else if (date.isEqual(date1)) {
            System.out.println(date + " is equal to" + date1);
        }
    }
}
