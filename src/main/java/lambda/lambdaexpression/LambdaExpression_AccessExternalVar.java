package lambda.lambdaexpression;

import java.util.function.UnaryOperator;

public class LambdaExpression_AccessExternalVar {

    //É permitido acessar variáveis externas dentro da expressão lambda, mas somente variáveis
    //finais ou variáveis que não são alteradas.

    public static void main(String[] args) {
        final Double x1 = 2.0;
        Double x2 = 2.0;
        Double x3 = 2.0;

        // COMPILA - variável externa 'x1' é final e pode ser utilizada na expressão lambda
        UnaryOperator<Double> elevarAoX1 = (Double y) -> Math.pow(y, x1);

        // COMPILA - variável externa 'x2' não é final, mas nunca é alterada, então pode ser utilizada dentro da expressão lambda
        UnaryOperator<Double> elevarAoX2 = (Double y) -> Math.pow(y, x2);

        // NÃO COMPILA - variável externa 'x3' é alterada dentro desse método, então não
        //pode ser utilizada dentro da expressão lambda
        // UnaryOperator<Double> elevarAoX3 = (Double y) -> Math.pow(y,x3);

        // alteração da variável x3 não permite que ela seja utilizada em expressões lambda
        x3 = 3.0;

        //Perceba que o compilador identifica que a variável x3 é alterada no final do método, e por isso,
        //não permite que ela seja utilizada na expressão lambda
    }
}
