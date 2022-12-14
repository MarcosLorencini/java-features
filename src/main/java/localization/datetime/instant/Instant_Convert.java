package localization.datetime.instant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Instant_Convert {

    //Você pode transformar um LocalDateTime em um Instant, e vice-versa, caso informe um fuso
    //horário.

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2019,5,27,13,1,1);
        System.out.println("LocalDateTime: "+ localDateTime);
        System.out.println(localDateTime.toInstant(ZoneOffset.UTC));
        System.out.println(localDateTime.toInstant(ZoneOffset.of("-3")));

        Instant instant = Instant.ofEpochSecond(1558962061L); // mesma data do localDateTime
        System.out.println("\nInstant "+ instant);
        System.out.println(LocalDateTime.ofInstant(instant, ZoneOffset.UTC));
        System.out.println(LocalDateTime.ofInstant(instant, ZoneOffset.of("-3")));
    }
}
