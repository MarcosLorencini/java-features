package localization.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class Period_Between {

    //. Também é possível criar um Period a partir de duas LocalDate.

    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(1990, 8, 6);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento, hoje);
        System.out.println(idade);

        //No exemplo anterior podemos ver que uma pessoa nascida no dia 6 de agosto de 1990 possuía
        //28 anos, 9 meses e 22 dias de idade no dia em que esse código foi executado: 28/05/2019.
    }
}
