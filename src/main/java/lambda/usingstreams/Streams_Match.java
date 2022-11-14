package lambda.usingstreams;

import java.util.stream.Stream;

public class Streams_Match {

    //É possível verificar se os elementos do Stream atendem a alguma validação utilizando as
    //operações finais allMatch, anyMatch e noneMatch.

    public static void main(String[] args) {
        boolean anyMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
                .anyMatch(e -> e > 5); // verifica se algum elemento é maior que 5
        System.out.println("anyMatch: " + anyMatch);

        boolean allMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
                .allMatch(e -> e > 5); // verifica se TODOS os elementos são maiores que 5

        boolean noneMatch = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)// stream de vários Integer
                .noneMatch(e -> e > 5); // verifica se NENHUM elemento é maior que 5
    }

    //anyMatch: true
    //allMatch: false
    //noneMatch: false

    //Perceba que na primeira operação é verificado se qualquer elemento é maior do que 5.
    //Na segunda, se todos os elementos são maiores do que 5. E na terceira, se nenhum elemento é
    //maior do que 5


}
