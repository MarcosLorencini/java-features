package lambda.usingstreams;

import java.util.stream.Stream;

public class Streams_Of {

    //É possível criar um Stream a partir de elementos específicos utilizando o método Stream.of.

    public static void main(String[] args) {
        Stream.of("A", 'B', 1, 2L, 3.0F, 4.0D).forEach(System.out::println);

        //A
        //B
        //1
        //2
        //3.0
        //4.0

        //Nesse caso foi criado um Stream que contém: String, Character, Integer, Long, Float e Double

    }
}
