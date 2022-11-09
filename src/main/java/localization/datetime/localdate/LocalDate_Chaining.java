package localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Chaining {
    //É comum utilizar o encadeamento de chamadas com esses métodos.

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, Month.MAY, 20);
        System.out.println(localDate);
        System.out.println(localDate.plusDays(1).plusMonths(1).plusYears(1));
    }

}
