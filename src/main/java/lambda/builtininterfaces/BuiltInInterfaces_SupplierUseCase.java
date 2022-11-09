package lambda.builtininterfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class BuiltInInterfaces_SupplierUseCase {

    //Um Supplier pode ser utilizado para fornecer uma função custosa em termos de processamento,
    //para que seja chamada apenas se for necessário:

    public static String validaIdade(int idade, Supplier<String> supplier) {
        if (idade < 18) {
            return "Menor de idade!";
        } else {
            return "Maior de idade! Validação realizada às " + supplier.get();
        }
    }

    public static void main(String[] args) {
        Supplier<String> supplier = () -> LocalDate.now().atTime(LocalTime.now())
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(validaIdade(17, supplier));
        System.out.println(validaIdade(18, supplier));
        //Menor de idade!
        //Maior de idade! Validação realizada às 2019-07-09T00:21:35.488
    }

    //Perceba que neste caso o supplier só precisou ser chamado na segunda vez, evitando uma
    //execução desnecessária da expressão lambda.
}
