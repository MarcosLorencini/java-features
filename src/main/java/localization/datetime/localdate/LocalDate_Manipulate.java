package localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDate_Manipulate {
    //Existem vários métodos para somar e subtrair de LocalDate
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, Month.MAY, 20);
        System.out.println(localDate);
        System.out.println("+2 dias: " + localDate.plusDays(2));
        System.out.println("+2 semanas "+localDate.plusWeeks(2));
        System.out.println("+2 meses "+localDate.plusMonths(2));
        System.out.println("+2 anos "+localDate.plusYears(2));
        System.out.println("+2 decadas "+localDate.plus(2, ChronoUnit.DECADES));
        System.out.println("-2 dias "+localDate.minusDays(2));
        System.out.println("-2 semanas "+localDate.minusWeeks(2));
        System.out.println("-2 meses "+localDate.minusMonths(2));
        System.out.println("-2 anos "+localDate.minusYears(2));
        System.out.println("-2 decadas "+localDate.minus(2, ChronoUnit.DECADES));
    }
}
