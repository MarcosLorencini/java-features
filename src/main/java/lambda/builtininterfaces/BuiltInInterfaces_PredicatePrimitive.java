package lambda.builtininterfaces;

import java.util.Random;
import java.util.function.IntPredicate;

public class BuiltInInterfaces_PredicatePrimitive {

    //Existem interfaces Predicate para lidar tipos primitivos: DoublePredicate, IntPredicate e
    //LongPredicate.

    public static void main(String[] args) {
        IntPredicate dados = x -> x == new Random().nextInt(7);
        System.out.println(dados.test(1)); // testa se o número gerado é igual a 1
    }
}
