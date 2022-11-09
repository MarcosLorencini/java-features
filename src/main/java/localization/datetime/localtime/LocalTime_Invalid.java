package localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Invalid {

    public static void main(String[] args) {

        // lança exceção: a hora deve estar entre 0 e 23

        System.out.println(LocalTime.of(24, 2, 3));

    }

}
