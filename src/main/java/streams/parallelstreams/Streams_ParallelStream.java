package streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Streams_ParallelStream {

    //É possível criar Streams paralelos diretamente em Coleções através do método parallelStream
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        System.out.println("Sequencial: ");
        list.stream()
                .forEach(System.out::println);

        System.out.println("Paralelo: ");
        list.stream()
                .forEach(System.out::println);

        //Sequencial:
        //A
        //B
        //C
        //Paralelo:
        //B
        //C
        //A

        //O Stream paralelo poderia ter impresso em qualquer ordem, pois não há nenhuma garantia na
        //ordem em que os elementos serão tratados.

    }
}
