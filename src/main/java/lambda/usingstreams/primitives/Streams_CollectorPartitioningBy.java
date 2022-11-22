package lambda.usingstreams.primitives;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorPartitioningBy {

    //É possível utilizar um Collector que particiona valores em True ou False a partir de um função
    //do tipo Predicate.

    public static void main(String[] args) {
        // Armazena o resultado do Stream em um Mapa
        // As Chaves são true ou false
        // O Valor é uma lista dos valores que atendem ou não a regra de particionamento
        Map<Boolean, List<String>> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
                .collect(Collectors.partitioningBy(s -> s.startsWith("R")));

        System.out.println(collect);
        //{false=[Luiz, Amélia], true=[Rinaldo, Rodrigo, Roseany]}
        //Perceba que nesse caso a regra de particionamento são os nomes que iniciam-se por R.


    }

}
