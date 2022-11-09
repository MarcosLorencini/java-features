package lambda.builtininterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BuiltInInterfaces_OperatorExample {

    //UnaryOperator e BinaryOperator

    //1. UnaryOperator é uma interface funcional que recebe um parâmetro de entrada e retorna um
    //valor do mesmo tipo da entrada.
    //Perceba que não existe método abstrato declarado, pois ela apenas estende a interface Function
    //já existente.
    // Sua definição na JDK é a seguinte:
    //java.util.function.Function<T, R>
    @FunctionalInterface
    public interface UnaryOperator<T> extends Function<T,T> {

    }

    //BinaryOperator é uma interface funcional que recebe dois parâmetros de entrada do mesmo
    //tipo, e retorna um valor do mesmo tipo das entradas.
    //Perceba que não existe método abstrato declarado, pois ela apenas estende a interface
    //BiFunction já existente.
    // Sua definição na JDK é a seguinte:
    //java.util.function.BiFunction<T>
    @FunctionalInterface
    public interface BinaryOperator<T> extends BiFunction<T,T,T> {

    }

    //Implementações possíveis para UnaryOperator ou BinaryOperator são funções que soma um
    //número fixo ou soma um número ao outro:

    public static void main(String[] args) {
        UnaryOperator<Integer> somaDois = x -> x + 2;
        System.out.println(somaDois.apply(7)); // soma 7 + 2

        BinaryOperator<Integer> somaNumeros = (x, y) -> x + y;
        System.out.println(somaNumeros.apply(1,5)); // soma 1 + 5
    }


}
