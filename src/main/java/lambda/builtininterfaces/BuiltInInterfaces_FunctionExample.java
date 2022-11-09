package lambda.builtininterfaces;

public class BuiltInInterfaces_FunctionExample {

    //Function e BiFunction

    //Function é uma interface funcional que recebe um parâmetro de entrada e retorna um valor.
    //Sua definição na JDK é a seguinte:

    //java.util.function.Function<T, R>

    @FunctionalInterface
    public interface Function<T,R> {
        R apply(T t);
    }

    //BiFunction é uma interface funcional que recebe dois parâmetros de entrada e retorna um
    //valor. Sua definição na JDK é a seguinte:

    //java.util.function.BiFunction<T>

    @FunctionalInterface
    public interface BiFunction<T, U, R> {
        R apply(T r, U u);
    }

    //Implementações possíveis para Function ou BiFunction são funções que multiplicam os valores
    //fornecidos:

    public static void main(String[] args) {
        Function<Integer, Double> duplica = x -> x * 2.5;
        System.out.println(duplica.apply(3)); // multiplica 3 * 2.5

        BiFunction<Integer, Integer, Double> multiplicaEDulplica = (x, y) -> x * y * 2.5;
        System.out.println(multiplicaEDulplica.apply(3, 4)); // multiplica 3 * 4 * 2.5
    }

}
