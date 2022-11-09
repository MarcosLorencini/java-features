package localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_Invalid {

    //Será lançada a exceção DateTimeException ao tentar criar uma data inválida.

    public static void main(String[] args) {
        System.out.println(ZonedDateTime.of(2019,4,31,9,20,3,1000,
                ZoneId.of("America/Sao_Paulo"))); // lança exceção: não existe 31 de abril

        //Exception in thread "main" java.time.DateTimeException: Invalid date 'APRIL 31'
        //  at java.time.LocalDate.create(LocalDate.java:431)
        //  at java.time.LocalDate.of(LocalDate.java:269)
        //  at java.time.LocalDateTime.of(LocalDateTime.java:361)
        //  at java.time.ZonedDateTime.of(ZonedDateTime.java:339)
        //  at
        //org.j6toj8.localization.timezones.ZonedDateTime_Invalid.main(ZonedDateTime_Invalid.
        //java:10)

    }

}
