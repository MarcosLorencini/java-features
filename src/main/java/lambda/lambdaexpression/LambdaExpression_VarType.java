package lambda.lambdaexpression;

import java.util.function.BinaryOperator;

public class LambdaExpression_VarType {

    //Ao tornar explícito o tipo de um dos argumentos, é obrigatório informar de todos.

    public static void main(String[] args) {
        // NÃO COMPILA - caso o tipo de um dos parâmetros for informado, é necessário informar de todos eles
       //  BinaryOperator<Double> elevarAoX = (Double y,x) -> Math.pow(y, x);

        // COMPILA - todos os parâmetros com tipos informados
        BinaryOperator<Double> elevarAOX2 = (Double y, Double x) -> Math.pow(y, x);
    }


}
