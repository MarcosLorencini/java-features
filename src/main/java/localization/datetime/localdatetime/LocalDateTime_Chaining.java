package localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Chaining {

    //É comum utilizar o encadeamento de chamadas com esses métodos.

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2019,5,20,9,20);
        System.out.println(localDateTime);
        System.out.println(localDateTime.plusDays(1).plusHours(1).plusYears(1));
    }
}
