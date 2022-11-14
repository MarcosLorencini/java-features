package lambda.usingstreams;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams_FindFirstAny {

    //É possível pegar o primeiro elemento do Stream utilizando a operação final findFirst, ou um
    //elemento qualquer com findAny.

    public static void main(String[] args) {
        Optional<Integer> findFirst = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)
                .findFirst();
        System.out.println("First: " + findFirst.get());

        Optional<Integer> findAny = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)
                .findAny();
        System.out.println("Any: " + findAny.get());

        //First: 7
        //Any: 7

        //Nesse caso, como o Stream é sequencial e não paralelo, os dois resultados são iguais. Em
        //Streams paralelos, que serão apresentados em uma próxima seção, a operação findAny pode
        //trazer resultados diferentes.
        //Assim como as operações max e min apresentadas anteriormente, findAny e findFirst retornam
        //um Optional vazio caso o Stream esteja vazio.

    }
}
