package lambda.usingstreams.primitives;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorPartitioningByDownstream {

    //Também é possível personalizar como a combinação dos valores particionados será feita.

    public static void main(String[] args) {
        // Armazena o resultado do Stream em um Mapa
        // As Chaves são true ou false
        // O Valor é uma String que são os nomes que atendem ou não a regra de particionamento
        Map<Boolean, String> collect  = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia","Roseany")
                .collect(Collectors.partitioningBy(s -> s.startsWith("R"),
                        Collectors.joining(",")));
        System.out.println(collect);
        //{false=Luiz,Amélia, true=Rinaldo,Rodrigo,Roseany}
        //Perceba que nesse caso os valores foram combinados utilizando um outro Collector, que juntou
        //os valores daquela mesma chave em uma única String separados por vírgula.



    }
}
