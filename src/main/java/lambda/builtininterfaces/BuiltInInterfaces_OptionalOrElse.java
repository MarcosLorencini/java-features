package lambda.builtininterfaces;

import java.util.Optional;

public class BuiltInInterfaces_OptionalOrElse {

    //É possível recuperar um valor padrão caso o Optional esteja vazio. O método orElse retorna um
    //valor diretamente, e o orElseGet retorna através de uma expressão lambda.

    public static void main(String[] args) {

        // Exemplo com Optional vazio
        Optional<String> optionalVazio = Optional.empty();

        // as duas variáveis abaixo terão a String "valor padrao", pois o optional está vazio
        String orElse = optionalVazio.orElse("valor padrao"); // obtém a String diretamente
        //obtem a String através da expressão lambda
        String orElseGet = optionalVazio.orElseGet(() -> {return "valor padrao";});

        System.out.println(orElse);
        System.out.println(orElseGet);

        // Exemplo com Optional com valor
        Optional<String> optionalComValor = Optional.of("valor");

        // as duas variáveis abaixo irão utilizar o valor presente no optional, pois ele já está preenchido
        String orElse2 = optionalComValor.orElse("valor padrao");
        String orElseGet2 = optionalComValor.orElseGet(() -> {return "valor padrao";});

        System.out.println(orElse2);
        System.out.println(orElseGet2);

        //valor padrao
        //valor padrao
        //valor
        //valor

        //Observe que esse é um ótimo caso para lembrar de um benefício das
        //expressões lambda. Na utilização de orElseGet a expressão lambda só é
        //executada caso o Optional esteja vazio. No caso do exemplo, como é apenas o
        //retorno de uma String, não faz diferença. Porém, se fosse uma operação mais
        //pesada, você só iria de fato executá-la se o Optional estivesse vazio. Caso
        //houvesse valor, a expressão lambda nem seria executada, evitando o custo de
        //processamento.





    }
}
