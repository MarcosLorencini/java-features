package localization.datetime.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Duration_Of {

    //Uma Duration é uma quantidade de tempo baseado em hora, como segundos, minutos ou horas. Por
    //exemplo: 2 horas, 3 minutos e 4 segundos.
    //1. A Duration é apresentada no formato PTxHxMxS, onde:
    //◦ PT representa que é um Duration.
    //◦ xH representa a quantidade de horas.
    //◦ xM representa a quantidade de minutos.
    //◦ xS representa a quantidade de segundos.
    //2. Assim como um Period, ao imprimir uma Duration apenas os campos com valor são
    //apresentados. Campos zerados são omitidos.
    //3. É possível criar uma Duration através dos métodos static chamados of*.

    public static void main(String[] args) {

        System.out.println(Duration.ofNanos(2)); // 2 nanossegundos
        System.out.println(Duration.ofMillis(2)); // 2 milissegundos
        System.out.println(Duration.ofSeconds(2)); // 2 segundos
        System.out.println(Duration.ofMinutes(2)); // 2 minutos
        System.out.println(Duration.ofHours(2)); // 2 horas
        System.out.println(Duration.ofDays(2)); // 2 dias (48 horas)
        System.out.println(Duration.ofSeconds(2,200)); // 2,0000002 segundos (2 segundos e 200 nanossegundos)
        System.out.println(Duration.of(2, ChronoUnit.MICROS)); // 2 microssegundos

        //Perceba que 2 dias é armazenado como 48 horas, pois Duration não armazena dias.

    }
}
