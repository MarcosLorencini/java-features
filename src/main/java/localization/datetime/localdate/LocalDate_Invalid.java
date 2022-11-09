package localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Invalid {

    //Será lançada a exceção DateTimeException ao tentar criar uma data inválida.

    public static void main(String[] args) {
        System.out.println(LocalDate.of(2019, Month.MAY, 33));
    }
}
