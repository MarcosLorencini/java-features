package lambda.builtininterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class BuiltInInterfaces_SupplierExample {

    //Supplier
    //Supplier é uma interface funcional que não recebe nenhum parâmetro de entrada, mas retorna
    //um valor. Sua definição na JDK é a seguinte:

    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    //Uma implementação possível para um Supplier é um gerador da data atual:

    public static void main(String[] args) {
        Supplier<LocalDate> supplier = () -> LocalDate.now();
        System.out.println(supplier.get()); // imprimirá a data atual
    }

    //A saída no console irá imprimir a data atual em que este código foi escrito
    //Perceba que a expressão lambda está simplificada, sem chaves {} ou return. Caso tenha dúvidas
    //com relação a isso, consulte novamente a seção sobre expressões lambda.


}
