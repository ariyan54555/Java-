import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_time {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
