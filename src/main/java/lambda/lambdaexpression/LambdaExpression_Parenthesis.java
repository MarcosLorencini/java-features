package lambda.lambdaexpression;


import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaExpression_Parenthesis {

    public static void main(String[] args) {

        // NÃO COMPILA - parênteses são obrigatórios ao declarar o tipo da variável da expressão lambda
        // UnaryOperator<Double> elevarAoQuadrado = Double x -> Math.pow(x ,2);

        // NÃO COMPILA - é obrigatório utilizar parênteses quando há mais de uma variável na expressão lambda
        // BinaryOperator<Double> elevarAoX = y, x -> Math.pow(y, x);

        // NÃO COMPILA - é obrigatório utilizar parênteses quando não há variáveis
        // Supplier<Double> elevar2aoQuadrado = -> Math.pow(2,2);

        // COMPILA - parênteses vazios quando não há variáveis
        Supplier<Double> elevar2aoQuadrado = () -> Math.pow(2,2);

        // COMPILA - sem parênteses quando há apenas uma variável e não escrevemos seu tipo
        UnaryOperator<Double> elevarAoQuadrado2 = x -> Math.pow(x,2);
    }
}
