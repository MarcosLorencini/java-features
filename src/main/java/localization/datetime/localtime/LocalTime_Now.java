package localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Now {

    //Um LocalTime representa uma hora sem fuso horário e sem data, como 10:15:30.125.
    //1. A hora é representada no formato hora:minuto:segundo.nano.
    //2. É possível criar um LocalTime através do método static chamado now.

    public static void main(String[] args) {

        //A saída no console irá apresentar a hora atual

        System.out.println(LocalTime.now());

    }
}
