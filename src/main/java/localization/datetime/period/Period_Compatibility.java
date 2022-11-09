package localization.datetime.period;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Period_Compatibility {

    //É possível somar um Period a um Instant, LocalDate ou LocalDateTime.

    public static void main(String[] args) {

        Period period = Period.ofDays(10);
        System.out.println("Period: " +period);

        Instant instant = Instant.ofEpochSecond(1558962061L);
        System.out.println("\nInstant: " + instant);
        System.out.println("Instant + Period: " + instant.plus(period));

        LocalDate localDateTime = LocalDate.of(2018,5,27);
        System.out.println("\nLocalDate: " + localDateTime);
        System.out.println("LocalDate + Period: "+localDateTime.plus(period));



    }


}
