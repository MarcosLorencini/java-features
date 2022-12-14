package lambda.builtininterfaces;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class BuiltInInterfaces_OperatorPrimitive {

    //Existem interfaces Operator para lidar tipos primitivos: DoubleBinaryOperator,
    //DoubleUnaryOperator, IntBinaryOperator, IntUnaryOperator, LongBinaryOperator, LongUnaryOperator.

    public static void main(String[] args) {
        IntUnaryOperator somaDois = x -> x + 2;
        System.out.println(somaDois.applyAsInt(7)); // soma 7 + 2

        IntBinaryOperator somaNumeros = (x, y) -> x + y;
        System.out.println(somaNumeros.applyAsInt(1,5)); // soma 1 + 5
    }
}
