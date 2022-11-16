package lambda.usingstreams.primitives;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorJoining {

    //Collect:

    //A operação final collect também é um tipo de Reduce, porém é utilizada para objetos mutáveis. Ou
    //seja, ao invés de utilizar a operação reduce com String, provavelmente seria mais eficiente utilizar a
    //operação collect com a classe StringBuilder, para evitar a criação de vários objetos do tipo String.
    //Como Java utiliza muitos objetos mutáveis, incluindo listas e mapas, geralmente a operação collect
    //será mais eficiente do que a reduce.

    //Por serem muito comuns, existem vários Collectors já implementados no Java, disponíveis na classe
    //Collectors.

    public static void main(String[] args) {
        //É possível utilizar um Collector que junta várias Strings.
        String collect = Stream.of("A", "B", "C")
                .collect(Collectors.joining());
        System.out.println(collect);
        //ABC

    }
}
