package lambda.usingstreams;

import java.util.stream.IntStream;

public class Streams_Filter {

    //É possível filtrar elementos do Stream utilizando a operação filter.

    public static void main(String[] args) {
        IntStream.range(0,4) // stream de 0 a 3
                .filter(e -> e % 2 == 0) // limita a números pares (resto da divisão por 2 é 0)
                .forEach(System.out::println); // imprime os elementos
    }

    //0
    //2

    //Nesse caso apenas os elementos pares foram impressos, pois a operação filter limitou àqueles
    //que possuem resto da divisão por 2 igual a 0.


}
