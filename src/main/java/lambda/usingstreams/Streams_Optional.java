package lambda.usingstreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams_Optional {

    //É possível encadear a operação final do Stream utilizando expressões lambda na classe
    //Optional.

    public static void main(String[] args) {
        // Exemplo sem encadear a chamada de Optional
        Optional<Integer> max = Stream.of(7, 2, 1)
                .max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);

        // Exemplo encadeando a chamada de Optional
        Stream.of(7, 2, 1)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    //Perceba que o método ifPresent é da classe Optional, mesmo que no segundo exemplo possa
    //parecer que ele faz parte do Stream. Em outras palavras, a operação final é max, e ifPresent é
    //uma chamada em Optional e não mais no Stream.
}
