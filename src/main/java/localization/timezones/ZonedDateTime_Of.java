package localization.timezones;

import java.time.*;

public class ZonedDateTime_Of {

    //Também é possível criar um ZonedDateTime através do método static chamado of.

    public static void main(String[] args) {
        System.out.println(ZonedDateTime.of(2019,6,9,13,20,3,
                1000, ZoneId.of("America/Sao_Paulo")));

        LocalDateTime localDateTime = LocalDateTime.of(2019, 6, 9, 13, 20,
                3, 1000);
        System.out.println(ZonedDateTime.of(localDateTime, ZoneId.of(
                "America/Sao_Paulo")));

        LocalDate localDate = LocalDate.of(2019, 6, 9);
        LocalTime localTime = LocalTime.of(13, 20, 3, 1000);
        System.out.println(ZonedDateTime.of(localDate, localTime, ZoneId.of
                ("America/Sao_Paulo")));

        //2019-06-09T13:20:03.000001-03:00[America/Sao_Paulo]
        //2019-06-09T13:20:03.000001-03:00[America/Sao_Paulo]
        //2019-06-09T13:20:03.000001-03:00[America/Sao_Paulo]

        //Perceba que é possível criar um ZonedDateTime diretamente, ou através de um LocalDateTime, ou
        //com uma junção de um LocalDate e um LocalTime. Note que em todos os casos é necessário
        //informar o fuso horário.






    }
}
