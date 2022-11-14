package lambda.usingstreams;

import java.util.stream.IntStream;

public class Streams_LazyMap {

    //Outras operações intermediárias também não costumam ser executadas se não for necessário.

    public static void main(String[] args) {
        IntStream.range(0, 10)
                .peek(e -> System.out.println("Peek: " +e))
                .limit(3)
                .forEach(e -> System.out.println("ForEach"));
    }

    //Peek: 0
    //ForEach: 0
    //Peek: 1
    //ForEach: 1
    //Peek: 2
    //ForEach: 2

    //Perceba que, mesmo que a operação peek esteja antes da operação limit, ela não é executada
    //para todos os elementos do Stream, apenas para aqueles que serão realmente utilizados.
}
