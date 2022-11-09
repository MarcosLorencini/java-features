package lambda.builtininterfaces;

import java.time.LocalDate;
import java.time.LocalTime;

public class BuiltInInterfaces_ConsumerExample {

    //Consumer e BiConsumer
    //Consumer é uma interface funcional que recebe um parâmetro de entrada, e não retorna nenhum valor.
    // Sua definição na JDK é a seguinte:

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    //BiConsumer é uma interface funcional que recebe dois parâmetros de entrada, e não retorna
    //nenhum valor. Sua definição na JDK é a seguinte:

    @FunctionalInterface
    public interface BiConsumer<T,U> {
        void accept(T t, U u);
    }

    //Implementações possíveis para Consumer ou BiConsumer são funções que imprimem informações
    //no console:

    public static void main(String[] args) {
        Consumer<Object> impressor = x -> System.out.println(x);
        impressor.accept(LocalDate.now());  // imprimirá a data atual

        BiConsumer<Object, Object> impressor2 = (x, y) -> { System.out.println(x);
            System.out.println(y); };
        impressor2.accept(LocalDate.now(), LocalTime.now()); // imprimirá a data atual e depois a hora atual
    }

}
