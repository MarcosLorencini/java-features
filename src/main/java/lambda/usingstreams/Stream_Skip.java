package lambda.usingstreams;

import java.util.stream.IntStream;

public class Stream_Skip {

    //Operações em Streams

    //As operações feitas em um Stream irão formar seu pipeline. As operações que podem ser realizadas
    //em um Stream são divididas em operações intermediárias e operações finais. O Stream pode
    //conter inúmeras operações intermediárias, porém somente uma final. Nos exemplos anteriores a
    //única operação utilizada foi o forEach, que é uma operação final. A seguir serão apresentadas
    //outras operações.

    //Operações intermediárias

    //É possível ignorar elementos de um stream com a operaçao skip.

    public static void main(String[] args) {
        IntStream.range(0,4)
                .skip(2)
                .forEach(System.out::println);
    }

    //2
    //3

    //Perceba que nesse caso os elementos 0 e 1 foram ignorados, pois são os dois primeiros
    //elementos do Stream. Isso ocorreu pela existência da operação skip.



}
