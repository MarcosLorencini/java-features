package localization.datetime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTime_Of {

    //Também é possível criar um LocalDateTime através do método static chamado of.

    public static void main(String[] args) {
        System.out.println(LocalDateTime.of(LocalDate.of(2019,5,20),
                LocalTime.of(9,20,12)));

        System.out.println(LocalDateTime.of(2019, 5,20,9,20));
        System.out.println(LocalDateTime.of(2019, Month.MAY, 20,9,20));
        System.out.println(LocalDateTime.of(2019, Month.MAY,20,9,20,12));
        System.out.println(LocalDateTime.of(2019,5,20,9,20,12,135));
        System.out.println(LocalDateTime.of(2019, Month.MAY, 20, 9, 20, 12, 135));
    }
}
