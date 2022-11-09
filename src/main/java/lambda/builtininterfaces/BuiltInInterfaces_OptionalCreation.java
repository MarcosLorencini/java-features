package lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalCreation {

    //Optional
    //O Java 8 possui um tipo específico para representar valores que podem não ter sido informados,
    //que é a classe Optional. A partir do Java 8, ela geralmente é uma opção melhor do que retornar ou
    //armazenar null, pois seus métodos auxiliam em várias situações.
    //1. É possível criar uma instância de Optional com valor através do método of.
    //2. É possível criar uma instância de Optional sem valor através do método empty.
    //3. É possível checar se uma instância de Optional possui um valor através do método isPresent.
    //4. É possível recuperar o valor de uma instância de Optional através do método get.

    // Exemplo de método sem Optional
    private static String recupereNomesMes(int mes) {
        if (mes == 1) {
            return "Janeiro";
        } else {
            return null;
        }
    }

    // Exemplo de método retornando Optional
    private static Optional<String> recupereNomeMesOptional(int mes) {
        if (mes == 1) {
            return Optional.of("Janeiro"); // cria Optional com valor
        } else {
            return Optional.empty(); // cria Optional vazio
        }
    }

    public static void main(String[] args) {
        String nomeMes1 = recupereNomesMes(1);
        if (nomeMes1 != null) { // valida se o valor existe através da tradicional comparação '!= null'
            System.out.println(nomeMes1);
        }

        Optional<String> nomeMes2 = recupereNomeMesOptional(1);
        if (nomeMes2.isPresent()) { // valida se o Optional possui um valor preenchido
            System.out.println(nomeMes2.get()); // recupera o valor dentro do Optional
        }
    }

    //Não é possível chamar o método of passando null como argumento. Para isso existe o método
    //ofNullable.


}
