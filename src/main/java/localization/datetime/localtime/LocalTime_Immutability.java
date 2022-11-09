package localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Immutability {

    //LocalTime é imutável, então é necessário armazenar o retorno de uma alteração em uma
    //variável.

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(9, 31,5);
        System.out.println(localTime);
        localTime.plusHours(1); // chamada perdida - a nova hora não foi armazenada em uma variável
        System.out.println(localTime);
        localTime = localTime.plusHours(1); // chamada útil - hora armazenada na variável
        System.out.println(localTime);

    }
}
