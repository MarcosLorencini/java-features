package localization.datetime.duration;

import java.time.Duration;
import java.time.LocalDate;

public class Duration_LocalDate {

    //Não é possível somar uma Duration a uma LocalDate, pois o primeiro representa tempo baseado
    //em hora, enquanto o outro armazena apenas datas.

    public static void main(String[] args) {
        Duration duration = Duration.ofHours(2);
        System.out.println("Duration: " + duration);

        LocalDate localDate = LocalDate.of(1990, 8, 6);
        System.out.println("LocalDate: " + localDate);

        System.out.println("LocalDate + Perido :" + localDate.plus(duration));

    }
}
