package streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Streams_ParallelForEachOrdered {

    //A operação forEachOrdered garante que a ordem será mantida mesmo em Streams paralelos.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        System.out.println("Sequencial: ");
        list.stream()
                .forEachOrdered(System.out::println);

        System.out.println("Paralelo: ");
        list.parallelStream()
                .forEachOrdered(System.out::println);

        //Sequencial:
        //A
        //B
        //C
        //Paralelo:
        //A
        //B
        //C


    }
}
