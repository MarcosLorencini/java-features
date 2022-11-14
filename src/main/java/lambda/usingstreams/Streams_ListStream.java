package lambda.usingstreams;

import java.util.Arrays;
import java.util.List;

public class Streams_ListStream {

    //É possível criar um Stream a partir de uma lista.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.stream().forEach(System.out::println);
    }
}
