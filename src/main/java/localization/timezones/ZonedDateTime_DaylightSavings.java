package localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_DaylightSavings {

    //Ao manipular um ZonedDateTime, será levado em conta o horário de verão daquele fuso horário.

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2018, 11, 3, 23, 30, 0, 0,
                ZoneId.of("America/Sao_Paulo"));
        System.out.println(zonedDateTime);
        System.out.println("+2 horas: " + zonedDateTime.plusHours(2));

        //2018-11-03T23:30-03:00[America/Sao_Paulo]
        //+2 horas: 2018-11-04T02:30-02:00[America/Sao_Paulo]

        //Neste exemplo o fuso horário que era -03:00 virou -02:00, pois esse foi o dia em que teve início o
        //horário de verão no Brasil. Outro detalhe é que por conta do horário de verão, ao somar 2 horas
        //às 23:30 resultou em 02:30 do dia seguinte. Se não houvesse horário de verão, o resultado seria
        //01:30.

    }
}
