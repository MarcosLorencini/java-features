package localization.datetime.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTime_Manipulate {

    //Existem vários métodos para somar e subtrair de LocalTime

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(9, 26,12);
        System.out.println(localTime);
        System.out.println("+2 horas: " + localTime.plusHours(2));
        System.out.println("+2 minutos "  + localTime.plusMinutes(2));
        System.out.println("+2 segundos " + localTime.plusSeconds(2));
        System.out.println("+2 nanosegundos "+ localTime.plusNanos(2));
        System.out.println("+2 microssegundos " + localTime.plus(2, ChronoUnit.MICROS));
        System.out.println("+2 milissegundos " + localTime.plus(2, ChronoUnit.MILLIS));
        System.out.println("-2 horas "+ localTime.minusHours(2));
        System.out.println("-2 minutos "+ localTime.minusMinutes(2));
        System.out.println("-2 segundos "+ localTime.minusSeconds(2));
        System.out.println("-2 nanosegundos "+localTime.minusNanos(2));
        System.out.println("-2 microsegundos "+ localTime.minus(2, ChronoUnit.MICROS));
        System.out.println("-2 milissegundos "+localTime.minus(2, ChronoUnit.MILLIS));


    }
}
