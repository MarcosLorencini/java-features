package lambda.builtininterfaces;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class BuiltInInterfaces_OptionalGetEmpty {

    //Será lançada uma exceção ao chamar o método get em um Optional vazio.

    public static void main(String[] args) {
        Optional<String> optionalComValor = Optional.of("valor");
        System.out.println(optionalComValor.get()); // recupera o valor corretamente

        Optional<String> optionalVazio = Optional.empty();
        System.out.println(optionalVazio.get()); // lança exceção

    }


}
