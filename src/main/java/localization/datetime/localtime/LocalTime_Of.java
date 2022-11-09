package localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Of {

    //Também é possível criar um LocalTime através do método static chamado of

    public static void main(String[] args) {

        System.out.println(LocalTime.of(9, 20, 1, 135000000));
        System.out.println(LocalTime.of(9, 20, 1, 135));
        System.out.println(LocalTime.of(9, 20,1));
        System.out.println(LocalTime.of(9, 20 ));
    }
}
