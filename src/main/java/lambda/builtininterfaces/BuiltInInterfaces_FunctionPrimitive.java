package lambda.builtininterfaces;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class BuiltInInterfaces_FunctionPrimitive {

    //Existem várias interfaces Function para lidar tipos primitivos: DoubleFunction,
    //DoubleToIntFunction, DoubleToLongFunction, IntFunction, IntToDoubleFunction, IntToLongFunction,
    //LongFunction, LongToDoubleFunction, LongToIntFunction, ToDoubleBiFunction, ToDoubleFunction,
    //ToIntBiFunction, ToIntFunction, ToLongBiFunction, ToLongFunction.

    public static void main(String[] args) {
        IntToDoubleFunction duplica = x -> x * 2.5;
        System.out.println(duplica.applyAsDouble(3)); // multiplica 3 * 2.5

        ToDoubleBiFunction<Integer, Integer> multiplicaEDuplica = (x, y) -> x * y * 2.5;
        System.out.println(multiplicaEDuplica.applyAsDouble(3,4)); // multiplica 3 * 4 * 2.5

    }
}
