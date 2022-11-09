package localization.datetime.period;

import java.time.Period;

public class Period_Of {

    //Um Period é uma quantidade de tempo baseado em datas, como anos, meses ou dias. Por exemplo: 2
    //anos, 3 meses e 4 dias.
    //1. O Period é apresentado no formato PxYxMxD, onde:
    //◦ P representa que é um Period.
    //◦ xY é a quantidade de anos. 5 anos seria 5Y.
    //◦ xM é a quantidade de meses. 3 meses seria 3M.
    //◦ xD é a quantidade de dias. 2 dias seria 2D.
    //2. Ao imprimir um Period, apenas os campos com valor são apresentados. Campos zerados são
    //omitidos.
    //3. É possível criar um Period através dos métodos static chamados of*.

    public static void main(String[] args) {
        System.out.println(Period.ofDays(2)); // período de 2 dias
        System.out.println(Period.ofMonths(2)); // período de 2 meses
        System.out.println(Period.ofWeeks(2)); // período de 2 semanas
        System.out.println(Period.ofYears(2)); // período de 2 anos
        System.out.println(Period.of(2,1,3)); // 2 anos, 1 mês e 3 dias

        //Perceba que o período de 2 semanas é apresentado como 14D, pois Period não armazena
        //semanas. O método ofWeeks é apenas um facilitador, onde cada semana é o equivalente a 7 dias.
    }

}
