package streams.parallelstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_ParallelGroupingByConcurrent {

    //Para coletar o resultado de um Stream paralelo utilize groupingByConcurrent ao invés de
    //groupingBy.

    public static void main(String[] args) {
        Map<Object, List<String>> collect1 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .parallel()
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(collect1);

        Map<Object, List<String>> collect2 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .parallel()
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(collect2);

    }

    //{4=[Luiz], 6=[Amélia], 7=[Rinaldo, Rodrigo, Roseany]}
    //{4=[Luiz], 6=[Amélia], 7=[Roseany, Rodrigo, Rinaldo]}
    //Pelo mesmo motivo do exemplo anterior, a ordem pode variar ao utilizar o
    //groupingByConcurrent, porém pode haver ganho de performance em grandes Streams paralelos,
    //pois a ordem não é necessariamente seguida e não há necessidade de criar múltiplos mapas.

}
