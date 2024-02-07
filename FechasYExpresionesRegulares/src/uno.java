import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class uno {
    public static void main(String[] args) {
        LocalDateTime proximoViernes = LocalDateTime.parse("26-1-2024 14:30");

        DateTimeFormatter esDateTimeFormat=
                DateTimeFormatter.ofPattern("dd/MM");
    }
}
