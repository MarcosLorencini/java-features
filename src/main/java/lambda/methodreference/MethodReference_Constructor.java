package lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Constructor {

    //Chamadas a um construtor também podem ser representadas como uma referência a um
    //método.

    public static void main(String[] args) {

        // representação com expressão lambda
        Function<String, Integer> stringParaInteger1 = s -> new Integer(s);

        // representação com referência ao construtor
        Function<String, Integer> stringParaInteger2 = Integer::new;

        System.out.println(stringParaInteger1.apply("1"));
        System.out.println(stringParaInteger2.apply("2"));

        //Esse exemplo é muito parecido com o anterior, com a única diferença sendo que o método
        //referenciado é um construtor. Perceba que o construtor também recebe um parâmetro e, assim
        //como no exemplo anterior, o compilador entende que o argumento da função lambda deve ser
        //passado para o construtor que foi chamado.



    }
}
