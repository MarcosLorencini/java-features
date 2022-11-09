package localization.datetime.period;

import java.time.Instant;
import java.time.Period;

public class Period_Instant {

    //Não é possível somar um Period que contém meses ou anos a um Instant. Como vimos na seção
    //anterior sobre Instant, ele não suporta operações com valores maiores que dias.

    public static void main(String[] args) {
        Period period = Period.ofMonths(1);
        System.out.println("Period: "+Period.ofMonths(1));

        Instant instant = Instant.ofEpochSecond(1558962061L);
        System.out.println("Instant: " + instant);
        System.out.println("Instant + Period: " + instant.plus(period));

        //Period: P1M
        //Instant: 2019-05-27T13:01:01Z
        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException:
        //Unsupported unit: Months
        //  at java.time.Instant.plus(Instant.java:862)
        //  at java.time.Instant.plus(Instant.java:207)
        //  at java.time.Period.addTo(Period.java:902)
        //  at java.time.Instant.plus(Instant.java:788)
        //  at
        //org.j6toj8.localization.datetime.period.Period_Instant.main(Period_Instant.java:15)
    }

}
