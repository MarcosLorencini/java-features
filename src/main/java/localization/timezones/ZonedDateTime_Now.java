package localization.timezones;

import java.time.ZonedDateTime;

public class ZonedDateTime_Now {

    //Nessa seção será apresenta a classe ZonedDateTime, que armazena Data, Hora e um fuso horário. Ou
    //seja, é muito parecida com a classe LocalDateTime, porém possui um fuso horário.
    //A representação de um ZonedDateTime é 2007-12-03T10:15:30+01:00 Europe/Paris.
    //1. É possível criar um ZonedDateTime através do método static chamado now.

    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
    }

    // 2019-06-09T18:10:08.863-03:00[America/Sao_Paulo]
}
