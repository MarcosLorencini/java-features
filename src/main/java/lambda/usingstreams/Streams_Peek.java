package lambda.usingstreams;

import java.util.Arrays;

public class Streams_Peek {

    //É possível observar os elementos que passam por um Stream utilizando a operação peek.

    public static void main(String[] args) {
        // Criação de um array comum de Strings
        String[] array = new String[] { "G", "T", "Y", "A" };
        Arrays.stream(array)
                .peek(e -> System.out.println("Peek: " + e)) // observa o que passou pelo Stream
                .forEach(e -> System.out.println("ForEach: " + e));
    }

    //Peek: G
    //ForEach: G
    //Peek: T
    //ForEach: T
    //Peek: Y
    //ForEach: Y
    //Peek: A
    //ForEach: A

    //A operação peek funciona apenas para observar o que está passando pelo Stream. Pode ser
    //muito útil para realizar debug ou log. Nesse caso os elementos estão sendo impressos duas vezes
    //no console, pois o método peek e o forEach estão ambos realizando essa mesma ação. Porém, em
    //aplicações reais, geralmente a operação final não será um forEach, de tal forma que fará sentido
    //utilizar o peek.


}
