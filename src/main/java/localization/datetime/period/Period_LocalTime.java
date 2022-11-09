package localization.datetime.period;

import java.time.LocalTime;
import java.time.Period;

public class Period_LocalTime {

    //Não é possível somar um Period a um LocalTime, pois o primeiro representa tempo baseado em
    //datas, e o segundo armazena apenas horários.

    public static void main(String[] args) {
        Period period = Period.ofDays(13);
        System.out.println("Period: " + period);

        LocalTime localTime = LocalTime.of(13,1,1);
        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalTime + Period: " + localTime.plus(period));

        //Period: P13D
        //LocalTime: 13:01:01
        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException:
        //Unsupported unit: Days
        //  at java.time.LocalTime.plus(LocalTime.java:1055)
        //  at java.time.LocalTime.plus(LocalTime.java:125)
        //  at java.time.Period.addTo(Period.java:906)
        //  at java.time.LocalTime.plus(LocalTime.java:988)
        //  at
        //org.j6toj8.localization.datetime.period.Period_LocalTime.main(Period_LocalTime.java
        //:15)

        //Veja que ocorreu exceção ao tentar somar um Period a um LocalTime.

    }
}
