package lambda.usingstreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams_MaxMinCount {

    //1. É possível executar uma ação final para cada elemento do Stream utilizando a operação forEach,
    //conforme demonstrado nos exemplos anteriores.
    //2. É possível recuperar o maior e o menor valor de um Stream utilizando as operações finais max e
    //min. E também é possível recuperar a quantidade de elementos de um Stream utilizando a
    //operação final count.

    public static void main(String[] args) {
        Optional<Integer> max = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
                .max(Comparator.naturalOrder()); // pega o maior número do Stream
        System.out.println("Max: " + max.get());

        Optional<Integer> min = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
                .min(Comparator.naturalOrder()); // pega o menor número do Stream
        System.out.println("Min: " + min.get());

        long count  = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
                .count(); // pega a quantidade de elementos do Stream
        System.out.println("Count: " + count);

        //Max: 9
        //Min: 1
        //Count: 8

        //No caso das operações max e min, é necessário passar como argumento qual comparador será
        //utilizado. Como os números possuem uma ordem natural, isto é, implementam a interface
        //Comparable, é possível utilizar um comparador que usa essa ordem natural, que é o
        //Comparator.naturalOrder(). Caso seja um tipo de objeto que não possui uma ordem natural, é
        //necessário passar como argumento uma outra implementação de Comparator.
        //As operações max e min retornam Optional pois, caso o Stream esteja vazio, será um Optional
        //vazio. Desde o Java 8, com a adição da classe Optional, isso tem sido preferido ao invés de
        //retornar null, pois facilita a programação funcional. A operação count não precisa de um
        //Optional, pois mesmo com um Stream vazio irá retornar 0.


    }
}
