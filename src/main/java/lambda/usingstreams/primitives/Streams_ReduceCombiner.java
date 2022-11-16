package lambda.usingstreams.primitives;

import java.util.stream.Stream;

public class Streams_ReduceCombiner {

    //É possível criar uma operação de Reduce que pode ser executada em várias Threads e depois
    //combinada em um único valor.

    public static void main(String[] args) {
        Integer reduce = Stream.of(7, 2, 3, 8)
                .reduce(1, (e1, e2) -> e1 *e2, (e1, e2) -> e1 * e2);
        //336
    }
    //Nesse caso é passado um argumento adicional. Ele é a função de combinação. Essa função é
    //utilizada quando o Stream é paralelo, ou seja, utiliza mais de uma thread. Ela pega o valor
    //retornado por 2 ou mais threads e combina-os em um único valor. Em uma operação de
    //multiplicação, a combinação também é uma multiplicação. Ou seja, caso a primeira thread
    //multiplique 7 e 2, resultando em 14, e a segunda multiplique 3 e 8, resultando em 24, a função
    //de combinação só precisa multiplicar 14 por 24 para chegar ao valor de 336. Sendo assim, a
    //função de combinação só faz sentido em um Stream paralelo, que será apresentado no próximo
    //capítulo
}
