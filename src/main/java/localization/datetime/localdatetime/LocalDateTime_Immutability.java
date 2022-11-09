package localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Immutability {

    //LocalDateTime é imutável, então é necessário armazenar o retorno de uma alteração em uma
    //variável

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2019,5,20,9,20);
        System.out.println(localDateTime);
        localDateTime.plusHours(1);// chamada perdida - a nova data/hora não foi armazenada em uma variável
        System.out.println(localDateTime);
        localDateTime = localDateTime.plusHours(1); // chamada útil - data/hora armazenada na variável
        System.out.println(localDateTime);
    }
}
