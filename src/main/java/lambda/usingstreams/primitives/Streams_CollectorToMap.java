package lambda.usingstreams.primitives;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToMap {

    //É possível utilizar um Collector para armazenar os elementos de um Stream em um mapa.

    public static void main(String[] args) {

        // Armazena o resultado do Stream em um Mapa
        // A Chave é o próprio nome (s -> s)
        // O Valor é o tamanho do nome
        Map<String, Integer> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia","Roseany")
                .collect(Collectors.toMap(s -> s, s -> s.length()));

        System.out.println(collect);
        //{Amélia=6, Roseany=7, Rodrigo=7, Rinaldo=7, Luiz=4}


    }
}
