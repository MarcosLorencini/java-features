package lambda.lambdaexpression;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LambdaExpression_Block {

    //É obrigatória a utilização de chaves, ponto e vírgula e return (caso a função retorne algum
    //valor) em expressões lambda com mais de uma linha.

    public static void main(String[] args) {
        UnaryOperator<Double> elevarAoQuadrado = (Double x) -> {
            double pow = Math.pow(x, 2);
            return pow;
        };

        Consumer<Double> imprime = (Double x) -> {
            double pow = Math.pow(x, 2);
            System.out.println(pow);
        };
    }
}
