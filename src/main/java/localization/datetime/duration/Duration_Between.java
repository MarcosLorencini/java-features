package localization.datetime.duration;

import localization.datetime.localdate.LocalDate_Of;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Duration_Between {

    //Também é possível criar uma Duration a partir de dois LocalTime.

    public static void main(String[] args) {
        LocalTime meiaNoite = LocalTime.of(0,0,0);
        LocalTime meioDia = LocalTime.of(12,0,0);

        System.out.println(Duration.between(meiaNoite, meioDia));
        System.out.println(Duration.between(meioDia, meiaNoite));
        System.out.println(Duration.between(meioDia, meioDia));

    }
}
