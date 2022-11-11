package lambda.builtininterfaces;

import java.util.OptionalInt;

public class BuiltInInterfaces_OptionalPrimitive {

    //Existem algumas classes para lidar com valor opcionais de variáveis primitivas, já que elas não
    //podem ser utilizada com generics: OptionalInt, OptionalDouble, OptionalLong.

    public static void main(String[] args) {
        OptionalInt optionalComValor = OptionalInt.of(5);
        OptionalInt optionalVazio = OptionalInt.empty();

        if (optionalComValor.isPresent()) {
            System.out.println(optionalComValor.getAsInt());
        }

        if (optionalVazio.isPresent()) {
            System.out.println(optionalVazio.getAsInt());
        }
    }
}
