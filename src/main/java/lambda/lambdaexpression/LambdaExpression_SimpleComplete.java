package lambda.lambdaexpression;

import java.util.function.UnaryOperator;

public class LambdaExpression_SimpleComplete {

    //Declarações de expressões lambda podem ser completas ou simplificadas.

    public static void main(String[] args) {

        // expressão lambda completa
        UnaryOperator<Double> elevarAoQuadrado1 = (Double x) -> { return Math.pow(x, 2); };
        // expressão lambda simplificada
        UnaryOperator<Double> elevarAoQuadrado2 = (x) -> Math.pow(x, 2);
    }

    //As duas funções lambda acima são idênticas, porém uma é mais explícita do que a outra.
    //5. Os parênteses só podem ser omitidos caso não haja a declaração do tipo, e haja apenas um
    //único argumento.
    //6. Expressões lambda que NÃO possuem argumentos também precisam dos parênteses.
}
