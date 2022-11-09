package localization.datetime.instant;

import java.time.Instant;

public class Instant_Of {

    //Também é possível criar um Instant através dos métodos static chamados ofEpochMilli ou
    //ofEpochSecond. O parâmetro é a quantidade de milissegundos, ou segundos, desde 1970-01-
    //01T00:00:00Z.

    public static void main(String[] args) {
        System.out.println(Instant.ofEpochMilli(1000000000000L));
        System.out.println(Instant.ofEpochSecond(1000000000));
        System.out.println(Instant.ofEpochSecond(1000000000, 123000000)); ; // com
       // nanossegundos
    }
}
