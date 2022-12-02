package streams.parallelstreams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_ParallelToConcurrentMap {

    //Para coletar o resultado de um Stream paralelo em um mapa, utilize a operação
    //toConcurrentMap.

    public static void main(String[] args) {
        Map<String, Integer> collect1 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia","Roseany")
                .parallel()
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println("toMap: " + collect1);

        Map<String, Integer> collect2 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .parallel()
                .collect(Collectors.toConcurrentMap(s -> s, s -> s.length()));
        System.out.println("toConcurrentMap: " + collect2);
    }

    //Perceba que o resultados das operações pode ser diferente. Ao utilizar o Collector
    //toConcurrentMap em um Stream paralelo, as operações podem ser executadas em qualquer
    //ordem e não há necessidade de criar múltiplos Map’s para serem combinados posteriormente.
    //Em grandes Streams, isso pode ocasionar em um ganho de performance.
}
