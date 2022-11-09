package localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Of {

    //3. Também é possível criar um LocalDate através do método static chamado of.
    //4. Você pode utilizar o enum Month ou um int para representar o mês.
    //5. Diferente das APIs antigas do Java, o mês agora começa no número 1, que é Janeiro.

    public static void main(String[] args) {
        System.out.println(LocalDate.of(2019, 5, 20));
        System.out.println(LocalDate.of(2019, Month.MAY, 20));
    }
}
