package lambda.usingstreams.primitives;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorGroupingByMapFactory {

    //Também é possível definir qual tipo de mapa será utilizado para agrupar.

    public static void main(String[] args) {
        // Armazena o resultado do Stream em um Mapa
        // A Chave é o tamanho do nome
        // O Valor são os nomes que tem aquele tamanho
        Map<Object, String> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .collect(Collectors.groupingBy(s ->s.length(), TreeMap::new, Collectors.joining(",")));
        System.out.println(collect);

        //{4=Luiz, 6=Amélia, 7=Rinaldo,Rodrigo,Roseany}
        //Perceba que o resultado desse exemplo é idêntico ao anterior, porém foi passado um argumento
        //a mais, que é o construtor do mapa que deveria ser utilizado.


    }
}
