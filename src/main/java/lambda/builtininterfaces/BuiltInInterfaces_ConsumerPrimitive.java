package lambda.builtininterfaces;

import java.time.LocalDate;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class BuiltInInterfaces_ConsumerPrimitive {

    //Existem interfaces Consumer para lidar tipos primitivos: DoubleConsumer, IntConsumer,
    //LongConsumer, ObjDoubleConsumer, ObjIntConsumer e ObjLongConsumer.

    public static void main(String[] args) {
        IntConsumer impressor = x -> System.out.println(x);
        impressor.accept(5); // imprimirá '5'

        ObjIntConsumer<Object> impressor2 = (x,y) -> {
            System.out.println(x); System.out.println(y); };
        impressor2.accept(LocalDate.now(), 5); // imprimirá a data atual e depois '5'
    }


}
