package lambda.usingstreams.primitives;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Streams_Primitives {

    //É possível criar Streams de tipos primitivos com as classes: DoubleStream, IntStream e LongStream

    public static void main(String[] args) {
        System.out.println(" DoubleStream");
        DoubleStream.of(1.1, 2.2, 3.3).forEach(System.out::println);

        System.out.println("\n IntStream");
        IntStream.of(1, 2, 3).forEach(System.out::println);
        System.out.println();
        IntStream.range(1, 4).forEach(System.out::println);

        System.out.println("\n LongStream");
        LongStream.of(1, 2, 3).forEach(System.out::println);
        System.out.println();
        LongStream.range(1, 4).forEach(System.out::println);

        // DoubleStream
        //1.12.23.3
        // IntStream
        //123
        //123
        // LongStream
        //123
        //123

    }
}
