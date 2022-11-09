package localization.datetime.period;

import org.w3c.dom.ls.LSOutput;

import java.time.Period;

public class Period_BiggerValues {

   //Period também armazena uma quantidade de dias maior que um mês, e de meses maior que
    //um ano.

    public static void main(String[] args) {

        System.out.println(Period.of(0, 60, 2)); // 60 meses e 2 dias
        System.out.println(Period.of(0, 30, 50)); // 30 meses e 50 dias
        System.out.println(Period.of(5, 200, 1000)); // 5 anos, 200 meses e 1000 dias
    }

    //Perceba que Period não converteu meses em anos, ou dias em meses.
}
