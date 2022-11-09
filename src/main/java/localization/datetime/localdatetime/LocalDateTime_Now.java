package localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Now {

    //Um LocalDateTime representa uma data com hora, mas sem fuso horário, como 2007-12-
    //03T10:15:30.125.
    //As regras para o LocalDateTime são basicamente a junção daquelas para LocalDate e LocalTime.
    //1. O LocalDateTime é apresentado no formato ano-mes-diaThora:minuto:segundo.nano.
    //2. É possível criar um LocalDateTime através do método static chamado now.

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

    }
}
