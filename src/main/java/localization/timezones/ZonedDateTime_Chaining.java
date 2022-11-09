package localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_Chaining {

    //É comum utilizar o encadeamento de chamadas com esses métodos.

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 5, 20, 9, 20, 4, 300,
                ZoneId.of("America/Sao_Paulo"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.plusDays(1).plusHours(1).plusYears(1));

        //2019-05-20T09:20:04.000000300-03:00[America/Sao_Paulo]
        //2020-05-21T10:20:04.000000300-03:00[America/Sao_Paulo]

    }
}
