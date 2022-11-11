package lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Complex {

    //Expressões lambda complexas não podem ser convertidas em referência a método, como a
    //expressão abaixo:

    public static void main(String[] args) {
        Function<String, Integer> stringParaInteger1 = s -> new Integer(s + "2");
        System.out.println(stringParaInteger1.apply("1"));
    }

    //Como nesse caso temos uma outra String + "2" sendo acrescentada no construtor, não há como
    //representar isso com uma simples referência ao construtor.
}
