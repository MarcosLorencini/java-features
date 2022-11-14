package lambda.usingstreams.primitives;

import java.util.Arrays;
import java.util.List;

public class Streams_MapTo {

    //É possível transformar um Stream comum em um Stream de primitivos utilizando as operações
    //mapTo*.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        System.out.println(" Stream para InstStream");
        list.stream()// cria Stream<Integer>
                .mapToInt(Integer::intValue) // transforma em IntStream
                .forEach(System.out::println);

        System.out.println("\n Stream para LongStream");
        list.stream()// cria Stream<Long>
                .mapToLong(Integer::longValue) // transforma em LongStream
                .forEach(System.out::println);

        System.out.println("\n Stream para DoubleStream");
        list.stream()// cria Stream<Double>
                .mapToDouble(Integer::doubleValue) // transforma em DoubleStream
                .forEach(System.out::println);

        //Stream para IntStream
        //1234
        // Stream para LongStream
        //1234
        // Stream para DoubleStream
        //1.02.03.04.0


    }
}
