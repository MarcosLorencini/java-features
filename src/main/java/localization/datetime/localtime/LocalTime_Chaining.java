package localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Chaining {

    //É comum utilizar o encadeamento de chamadas com esses métodos.

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(9, 32, 5);
        System.out.println(localTime);
        System.out.println(localTime.plusHours(1).plusMinutes(1)
                .plusSeconds(1).plusNanos(1));

    }
}
