package localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_AdjustDifferentUnit {

    //Ao manipular a data ou hora, o LocalDateTime irá manipular os outros campos conforme
    //necessário.

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2019,12,31,23,59,59);
        System.out.println(localDateTime);
        System.out.println(localDateTime.plusSeconds(2)); ; // + 2 segundos, vira o ano
    }
}
