package localization.datetime.period;

import java.time.Period;

public class Period_Curiosities {

    //Curiosidades!
    //É possível normalizar um Period que não está com o intervalo padrão através
    //do método normalized. Mas serão considerados apenas os anos e meses,
    //deixando os dias intactos.

    public static void main(String[] args) {

        System.out.println(Period.of(0,60,2)); // P60M2D
        System.out.println(Period.of(0,60,2).normalized()); ; // P5Y2D
        System.out.println(Period.of(0,30,50)); // P30M50D
        System.out.println(Period.of(0,30,50).normalized()); // P2Y6M50D

        //Também é possível trabalhar com números negativos e normaliza-los.

        System.out.println(Period.of(1,-25,0)); // P1Y-25M
        System.out.println(Period.of(1,-25,0).normalized()); // P-1Y-1M

    }
}
