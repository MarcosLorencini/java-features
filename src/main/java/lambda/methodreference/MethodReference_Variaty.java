package lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Variaty {

    //A variedade de formas para representar uma mesma expressão lambda pode ser grande, então
    //cuidado para não se confundir.

    // ATENÇÃO! Todas essas expressões lambda são equivalentes!

    public static void main(String[] args) {
        Function<Integer, String> lambda1 = (Integer x) -> { return String.valueOf(x); };
        Function<Integer, String> lambda2 = (x) -> { return String.valueOf(x); };
        Function<Integer, String> lambda3 = x -> { return String.valueOf(x); };

        Function<Integer, String> lambda4 = (Integer x) -> String.valueOf(x);
        Function<Integer, String> lambda5 = (x) -> String.valueOf(x);
        Function<Integer, String> lambda6 = x -> String.valueOf(x);

        Function<Integer, String> lambda7 = String::valueOf;

        //Você já viu todas as formas de criar uma expressão lambda, desde a mais completa até a mais
        //simples. Tenha certeza que conhece todas essas variações para o exame de certificação.

     }

}
