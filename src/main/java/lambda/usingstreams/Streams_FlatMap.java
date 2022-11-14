package lambda.usingstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streams_FlatMap {

    //É possível transformar um Stream de vários Arrays em um único Stream contínuo utilizando o
    //método flatMap.

    public static void main(String[] args) {
        // Criação de 3 arrays distintos
        String[] array1 = new String[] { "A", "B", "C" };
        String[] array2 = new String[] { "D", "E", "F" };
        String[] array3 = new String[] { "G", "H", "I"};

        Stream.of(array1, array2, array3) // criação de um Stream de Arrays
                .flatMap(a -> Arrays.stream(a)) // transforma os dados de cada array em um único fluxo de dados
                .forEach(System.out::println); // imprime os elementos
    }

    //A
    //B
    //C
    //D
    //E
    //F
    //G
    //H
    //I

    //Perceba que nesse caso existem 3 Arrays distintos. Então cria-se um Stream contendo 3 Arrays. O
    //cenário comum seria um que cada elemento do Stream fosse um objeto do tipo Array. Porém, ao
    //utilizar a operação flatMap, é criado um Stream para cada um desses Arrays, que são unidos e
    //formam um único Stream contínuo.
}
