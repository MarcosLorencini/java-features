package lambda.usingstreams.primitives;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorGroupingByDownstream {

    //Também é possível personalizar a maneira que o valores com chaves iguais serão combinados.

    public static void main(String[] args) {

        // Armazena o resultado do Stream em um Mapa
        // A Chave é o tamanho do nome
        // O Valor são os nomes que tem aquele tamanho
        Map<Object, String> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.joining(",")));
        System.out.println(collect);

        //{4=Luiz, 6=Amélia, 7=Rinaldo,Rodrigo,Roseany}

        //Perceba que nesse caso os valores foram combinados utilizando outro Collector, que agrupou os
        //nomes separando com vírgula.

    }
}
