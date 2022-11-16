package lambda.usingstreams.primitives;

import java.util.stream.IntStream;

public class Streams_RangeClosed {

    //É possível utilizar a operação rangeClosed ao invés de range, deixando o código mais legível.

    public static void main(String[] args) {
        IntStream.range(1, 4).forEach(System.out::println);
        System.out.println();
        IntStream.rangeClosed(1, 4).forEach(System.out::println);
    }

    //123
    //1234

    //Perceba que na chamada utilizando range, o último número é exclusivo (não faz parte do
    //Stream). No rangeClosed, tanto o primeiro quanto o último número são inclusivos (fazem parte
    //do Stream).

}
