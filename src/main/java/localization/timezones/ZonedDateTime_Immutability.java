package localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_Immutability {

    //ZonedDateTime é imutável, então é necessário armazenar o retorno de uma alteração em uma
    //variável.

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 5, 20, 9, 20, 3, 300,
                ZoneId.of("America/Sao_Paulo"));
        System.out.println(zonedDateTime);
        zonedDateTime.plusHours(1);
        System.out.println(zonedDateTime); // chamada perdida - a nova data/hora não foi armazenada em uma variável
        zonedDateTime.plusHours(1);
        zonedDateTime = zonedDateTime.plusHours(1); // chamada útil - data/hora armazenada na variável
        System.out.println(zonedDateTime);

        //2019-05-20T09:20:03.000000300-03:00[America/Sao_Paulo]
        //2019-05-20T09:20:03.000000300-03:00[America/Sao_Paulo]
        //2019-05-20T10:20:03.000000300-03:00[America/Sao_Paulo]


    }
}
