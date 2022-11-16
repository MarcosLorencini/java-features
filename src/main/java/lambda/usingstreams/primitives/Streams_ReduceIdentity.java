package lambda.usingstreams.primitives;

import java.util.stream.Stream;

public class Streams_ReduceIdentity {

    //É possível criar uma operação de Reduce informando o valor de identidade.

    public static void main(String[] args) {
        Integer reduce = Stream.of(7, 2, 3, 8)
                .reduce(1,(e1, e2) -> e1 * e2);
        System.out.println(reduce);
        //336
    }
    //Nesse caso é possível informar o valor de identidade da função. O conceito de valor ou função
    //de identidade são um pouco mais complexos, mas para a certificação apenas compreenda que
    //ele representa um valor neutro. Ou seja, para a operação de multiplicação, o valor de identidade
    //é 1, pois qualquer valor multiplicado por 1 resulta nele mesmo. Caso fosse uma operação de
    //soma, o valor de identidade seria 0, pois qualquer valor somado a 0 resulta nele mesmo.
    //Além disso, se o Stream estiver vazio, o valor de identidade será retornado. Por isso, diferente
    //do exemplo anterior, não é necessário retornar um Optional.
}
