package lambda.builtininterfaces;

import java.util.Random;

public class BuiltInInterfaces_PredicateExample {

    //Predicate é uma interface funcional que recebe um parâmetro de entrada e retorna um valor
    //booleano. Sua definição na JDK é a seguinte

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    //BiPredicate é uma interface funcional que recebe dois parâmetros de entrada e retorna um
    //valor booleano. Sua definição na JDK é a seguinte:

    @FunctionalInterface
    public interface BiPredicate<T, U> {
        boolean test(T t, U u);
    }

    // Implementações possíveis para Predicate ou BiPredicate são funções que verificam se o valor
    //de entrada é igual ao valor sorteado:

    public static void main(String[] args) {
        Predicate<Integer> dado = x -> x.equals(new Random().nextInt(7));
        System.out.println(dado.test(1)); // testa se o número gerado é igual a 1

        BiPredicate<Integer, Integer> dadoDuplo = (x, y) -> x.equals(new Random().nextInt(7)) ||
                y.equals(new Random().nextInt(7));
        System.out.println(dadoDuplo.test(1, 2));
    }

    // testa se o primeiro número gerado é igual a 1
    // ou se o segundo número gerado é igual a 2

    //A saída no console é aleatória, pois depende do valor sorteado. Um valor possível seria false e
    //true.
}
