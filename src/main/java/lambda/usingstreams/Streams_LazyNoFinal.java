package lambda.usingstreams;

import java.util.stream.IntStream;

public class Streams_LazyNoFinal {

    //Execução sob-demanda (lazy):

    //As operações intermediárias de um Stream só são executadas quando necessário. Ou seja, mesmo
    //que a operação esteja presente no pipeline, não é certeza de que ela será executada.

    //1. Nada será feito se o Stream não contiver uma operação final.

    public static void main(String[] args) {
        IntStream.range(0, 4)
                .filter(e -> e % 2 == 0)
                .limit(3)
                .map(e -> e * 2)
                .peek(System.out::println);
    }

    //Nesse caso nada é impresso no console, pois nenhuma operação final foi aplicada no Stream.
    //Ou seja, se não há nada consumindo o resultado desse Stream, o Java nem precisa executar o
    //pipeline criado.
}
