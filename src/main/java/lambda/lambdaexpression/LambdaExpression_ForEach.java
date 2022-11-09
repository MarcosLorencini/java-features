package lambda.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression_ForEach {

    //Existem muitos métodos já disponíveis no Java 8 que se beneficiam da sintaxe de expressões
    //lambda, como o forEach de listas.

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        lista.forEach((numero) -> { System.out.println(numero); });
    }

    //Veja que o novo método forEach executa a expressão lambda passada como parâmetro para
    //cada item da lista, imprimindo todos no console. A expressão lambda recebe como parâmetro
    //um número, que é o número da lista.
    //Neste caso, a interface funcional que está sendo implementada pela expressão lambda é
    //chamada Consumer. Ela será explicada em detalhes em uma seção posterior, juntamente com
    //outras interfaces funcionais padrões do Java 8. Nesta seção é importante apenas entender o que
    //são as expressões lambda e como é sua sintaxe.
}
