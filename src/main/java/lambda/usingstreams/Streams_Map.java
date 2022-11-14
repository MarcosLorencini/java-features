package lambda.usingstreams;

import java.util.stream.IntStream;

public class Streams_Map {

    //É possível aplicar uma transformação nos elementos do Stream utilizando a operação map.

    public static void main(String[] args) {
        IntStream.range(0,4)
                .map(e -> e * 2)
                .forEach(System.out::println);
    }

    //0
    //2
    //4
    //6

    //Perceba que nesse caso os elementos sofreram uma transformação, que foi a multiplicação por
    //2, antes de serem impressos no console.


}
