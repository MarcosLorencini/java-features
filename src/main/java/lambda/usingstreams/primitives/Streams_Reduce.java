package lambda.usingstreams.primitives;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams_Reduce {

    //Reduce e Collectors:

    //Reduce:

    //Reduce é uma das principais operações final que podem ser feitas em um Stream. Reduce é uma
    //operação que transforma os vários valores do Stream em um único valor. Várias operações
    //apresentadas anteriormente são um tipo de Reduce, como: max, min e summaryStatistics. Porém, nem
    //sempre essas operações são suficientes, e por isso existem os métodos reduce. Eles permitem a
    //implementação de operações personalizadas de Reduce

    //É possível criar uma operação de Reduce personalizada com o método reduce() que recebe 1
    //argumento.

    public static void main(String[] args) {
        Optional<Integer> reduce = Stream.of(7, 2, 3, 8)
                .reduce((e1, e2) -> e1 * e2); // reduce que multiplica todos os números

        System.out.println(reduce);
        //336
    }

    //Nesse caso está sendo feito um Reduce onde o resultado da operação anterior é passado para a
    //próxima execução. Ou seja, primeiro é feita a multiplicação de 7 * 2, que é 14. Então a função é
    //chamada novamente passando como argumento o resultado anterior (14) e o próximo número
    //do Stream (3). O resultado é 42. Então a função é chamada uma última vez passando o resultado
    //anterior (42) e o próximo número do Stream (8), o que dá o resultado de 336.
}
