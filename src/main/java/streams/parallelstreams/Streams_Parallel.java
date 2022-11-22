package streams.parallelstreams;

import java.util.Arrays;

public class Streams_Parallel {

    //Desenvolver código que usa Streams Paralelos, incluindo operação de decomposição e
    //operação de redução em Streams

    //Streams podem ser sequenciais ou paralelos. Os sequencias foram vistos na seção anterior,
    //enquanto os paralelos serão apresentados nesta seção. Streams paralelos são executados por mais
    //de uma Thread, geralmente uma quantidade igual à quantidade de núcleos do processador onde a
    //aplicação está sendo executada. Apesar disso, nem sempre é útil utilizá-los. Seu ganho real é em
    //Streams com grande volumes de dados. Em um Stream pequeno, transformá-lo em paralelo pode
    //até causar uma perda de performance.
    //Ao utilizar qualquer tipo de Stream, é recomendável não executar funções lambdas que causem
    //efeitos colaterais, como mudanças no estado de objetos. Em Streams paralelos essa recomendação é
    //ainda mais importante.

    public static void main(String[] args) {

        //É possível transformar qualquer Stream em paralelo utilizando o método parallel.

        String[] array= new String[] {"A", "B", "C"};
        Arrays.stream(array)
                .parallel() // stream transformado em paralelo
                .forEach(System.out::println);
        //B
        //C
        //A
        //O Stream paralelo poderia ter impresso em qualquer ordem, pois não há nenhuma garantia na
        //ordem em que os elementos serão tratados.

    }


}
