package lambda.usingstreams.primitives;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorAveragingInt {

    //. É possível utilizar um Collector para representar cada elemento como um número e calcular a
    //média entre eles.

    public static void main(String[] args) {
        // Calcula a média do tamanho de cada nome
        Double collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .collect(Collectors.averagingInt(s -> s.length()));

        System.out.println(collect);
        //6.2

    }
}
