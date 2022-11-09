package localization.datetime.instant;

import java.time.Instant;

public class Instant_Immutability {

    //. Instant é imutável, então é necessário armazenar o retorno de uma alteração em uma variável.
    //7. Assim como as outras classes de data e hora, é comum utilizar o encadeamento de chamadas
    //com esses métodos.
    //8. Assim como as outras classes de data e hora, ao manipular o Instant irá manipular os outros
    //campos conforme necessário.

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochMilli(1000000000000L);
        System.out.println(instant);
        instant.plusSeconds(60);// chamada perdida - a nova data/hora não foi armazenada em uma variável
        System.out.println(instant);
        instant = instant.plusSeconds(60); // chamada útil - data/hora armazenada na variável
        System.out.println(instant);
    }
}
