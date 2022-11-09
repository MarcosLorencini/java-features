package localization.datetime.instant;

import java.time.Instant;

public class Instant_Now {

    //Um Instant representa um momento na linha do tempo, no fuso horário do UTC (às vezes chamado
    //de GMT), como 2007-12-03T10:15:30.125Z.
    //O Instant difere de todos os tipos apresentados anteriormente, pois possui um fuso horário (UTC) e
    //representa o mesmo momento na linha do tempo em qualquer lugar do mundo.
    //1. O Instant é apresentado no formato ano-mes-diaThora:minuto:segundo.nanoZ.
    //2. É possível criar um Instant através do método static chamado now.

    public static void main(String[] args) {
        System.out.println(Instant.now());
    }

    //A saída no console irá apresentar a data e hora atual no fuso horário UTC
}
