package localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Immutability {

    //LocalDate é imutável, então é necessário armazenar o retorno de uma alteração em uma
    //variável.

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, Month.MAY, 20);
        System.out.println(localDate);
        localDate.plusDays(1); // chamada perdida - a nova data não foi armazenada em uma variável
        System.out.println(localDate);
        localDate = localDate.plusDays(1); // chamada útil - data armazenada na variável
        System.out.println(localDate);


    }
}
