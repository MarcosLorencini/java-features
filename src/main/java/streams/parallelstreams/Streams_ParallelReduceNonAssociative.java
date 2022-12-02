package streams.parallelstreams;

import java.util.stream.Stream;

public class Streams_ParallelReduceNonAssociative {

    //Ao realizar uma operação de reduce acumuladores não-associativos irá gerar resultados
    //inesperados.

    public static void main(String[] args) {
        Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
                .reduce((e1, e2) -> e1 - e2)
                .ifPresent(System.out::println);

        Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
                .parallel()
                .reduce((e1, e2) -> e1 -e2)
                .ifPresent(System.out::println);
    }
    //-18
    //8

    //Isso ocorre pois a operação de subtração não é associativa, então o resultado pode variar
    //conforme o Stream for "fatiado" para ser executado em paralelo. Ou seja, fazer 1 - 2 - 3 - 4
    //não é o mesmo que fazer (1 - 2) - (3 - 4).


}
