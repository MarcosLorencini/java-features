package lambda.builtininterfaces;

import java.util.Random;
import java.util.function.IntSupplier;

public class BuiltInInterfaces_SupplierPrimitive {

    //Existem interfaces Supplier para lidar tipos primitivos: BooleanSupplier, IntSupplier,
    //LongSupplier e DoubleSupplier.

    public static void main(String[] args) {
        IntSupplier randomIntSupplier = () -> new Random().nextInt();
        System.out.println(randomIntSupplier.getAsInt()); //// getAsInt retorna um int primitivo
    }

    //O resultado na console será imprimir o int primitivo gerado aleatoriamente.
}
