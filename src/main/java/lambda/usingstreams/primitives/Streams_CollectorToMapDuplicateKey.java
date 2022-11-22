package lambda.usingstreams.primitives;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToMapDuplicateKey {

    //Também é possível armazenar em um mapa para casos em que a chave for se repetir. O terceiro
    //argumento do método toMap define a regra de mesclagem dos valores para chaves iguais.

    public static void main(String[] args) {

        // Armazena o resultado do Stream em um Mapa
        // A Chave é o tamanho do nome
        // O Valor são os nomes com aquele tamanho
        Map<Object, Object> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia","Roseany")
                .collect(Collectors.toMap(s -> s.length(), s -> s, (s1, s2) -> s1 + "," + s2));
        System.out.println(collect);

        //{4=Luiz, 6=Amélia, 7=Rinaldo,Rodrigo,Roseany}

    }
}
