package lambda.methodreference;

import java.util.function.BiFunction;

public class MethodReference_TypeWithParam {

    //Também é possível utilizar a referência ao método de um tipo, como no exemplo anterior,
    //mesmo que o método receba parâmetros.

    public static void main(String[] args) {
        // representação com expressão lambda
        BiFunction<Integer, Integer, Integer> comparador1 = (x, y) -> x.compareTo(y);

        // representação com referência ao método compareTo do tipo Integer (que recebe um parâmetro)
        BiFunction<Integer, Integer, Integer> comparador2 = Integer::compareTo;

        System.out.println(comparador1.apply(1,2));
        System.out.println(comparador2.apply(1,2));
    }

    //Nesse exemplo o compilador "descobre" ainda mais coisas que nos exemplos anteriores. Ao
    //escrever apenas a referência ao método, o compilador entende que a variável x, que vem
    //primeiro, será a instância de Integer onde o método compareTo será chamado. E que y é a
    //instância de Integer que será passada como argumento para o método compareTo
}
