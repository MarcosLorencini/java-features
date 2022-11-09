package localization.datetime.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Instant_Manipulate {

    //Existem vários métodos para somar e subtrair de Instant. Porém, não suporta operações com
    //unidades maiores do que dias.

    public static void main(String[] args) {

        Instant instant = Instant.ofEpochMilli(1000000000000L);
        System.out.println(instant);
        System.out.println("+2 segundos: " + instant.plusSeconds(2));
        System.out.println("+2 nanosegundos: " + instant.plusNanos(2));
        System.out.println("+2 microssegundos: " + instant.plus(2, ChronoUnit.MICROS));
        System.out.println("+2 milissegundos: " + instant.plus(2, ChronoUnit.MILLIS));
        System.out.println("-2 segundos: " + instant.minusSeconds(2));
        System.out.println("-2 nanosegundos: " + instant.minusNanos(2));
        System.out.println("-2 microssegundos: " + instant.minus(2, ChronoUnit.MICROS));
        System.out.println("-2 milissegundos: " + instant.minus(2, ChronoUnit.MILLIS));
        System.out.println("+2 dias: " + instant.plus(2, ChronoUnit.DAYS));
        System.out.println("+2 semanas: " + instant.plus(2, ChronoUnit.WEEKS)); // erro de
       // execução

    }
}
