package lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalNullable {

    //Não é possível chamar o método of passando null como argumento. Para isso existe o método
    //ofNullable.

    public static void main(String[] args) {
        // Exemplo tentando utilizar .of e passando 'null' como argumento
        try {
            Optional.of(null); // Lança NullPointerException nesta linha
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Exemplo utilizando o método correto: .ofNullable
        Optional<String> ofNullable = Optional.ofNullable(null);  // Cria um Optional vazio
        System.out.println(ofNullable.isPresent()); // Imprime 'false' pois não possui valor

    }


}
