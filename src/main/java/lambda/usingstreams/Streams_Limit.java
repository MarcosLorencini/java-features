package lambda.usingstreams;

import java.util.stream.IntStream;

public class Streams_Limit {

    //É possível limitar a quantidade de elementos que serão processados utilizando a operação
    //limit.

    public static void main(String[] args) {
        IntStream.range(0,4) // stream de 0 a 3
                .limit(2) // limita a 2 elementos
                .forEach(System.out::println); // imprime os elementos
    }

    //0
    //1

    //Nesse caso apenas os 2 primeiros elementos foram impressos no console, pois a operação limit
    //limitou a quantidade de elementos a serem processados.
}
