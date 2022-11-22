package lambda.usingstreams.primitives;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorGroupingBy {

    //. É possível utilizar um Collector que cria um mapa agrupando valores que tem a mesma chave
    //em uma lista.

    public static void main(String[] args) {
        // Armazena o resultado do Stream em um Mapa
        // A Chave é o tamanho do nome
        // O Valor é uma lista com os nomes que tem aquele tamanho
        Map<Object, List<String>> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(collect);

        //{4=[Luiz], 6=[Amélia], 7=[Rinaldo, Rodrigo, Roseany]}


    }
}
