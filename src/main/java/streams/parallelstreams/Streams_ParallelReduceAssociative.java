package streams.parallelstreams;

import java.util.stream.Stream;

public class Streams_ParallelReduceAssociative {

    //Ao realizar uma operação de reduce não há problema caso o acumulador seja associativo.
    public static void main(String[] args) {
        Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
                .reduce((e1, e2) -> e1 * e2)
                .ifPresent(System.out::println);

        Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
                .parallel()
                .reduce((e1, e2) -> e1 * e2)
                .ifPresent(System.out::println);
    }

    //13440
    //13440

    //Perceba que o resultado com o Stream sequencial é idêntico ao paralelo. Isso ocorre porque a
    //operação de multiplicação é associativa, ou seja, fazer (2 x 2) x (3 x 3) é o mesmo que fazer (2
    //x 2 x 3) x 3, ou até mesmo 2 x (2 x 3) x 3.

}
