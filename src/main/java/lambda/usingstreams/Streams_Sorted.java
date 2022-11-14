package lambda.usingstreams;

import java.util.Arrays;

public class Streams_Sorted {

    //É possível ordenar os elementos de um Stream utilizando a operação sorted.

    public static void main(String[] args) {
        // Criação de um array comum de Strings
        String[] array = new String[] { "G", "T", "Y", "A", "B", "C", "A", "B", "F" };

        Arrays.stream(array)
                .sorted() // ordena utilizando a ordem natural
                .forEach(System.out::println);
    }

    //A
    //A
    //B
    //B
    //C
    //F
    //G
    //T
    //Y

    //Nesse caso todos os elementos são ordenados utilizando a ordem natural dos objetos String,
    //pois eles já implementam a interface Comparable, sendo apresentados em ordem alfabética.
    //Também existe uma versão do método sort que recebe como argumento uma implementação
    //de Comparator, caso deseje ordenar de outra forma.


}
