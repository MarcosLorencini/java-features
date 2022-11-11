package lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Type {

    //Chamadas a métodos de uma classe, sem especificar a instância específica, também podem ser
    //representados como uma referência a um método.

    public static void main(String[] args) {
        // representação com expressão lambda
        Function<Integer, Double> intParaDouble1 = x -> x.doubleValue();

        // representação com referência ao método doubleValue
        Function<Integer, Double> intParaDouble2 = Integer::doubleValue;

        System.out.println(intParaDouble1.apply(8));
        System.out.println(intParaDouble2.apply(8));
    }

    //Nesse exemplo, a referência está sendo feita ao método doubleValue do tipo Integer. Só é
    //possível representar a primeira expressão lambda na forma de um method reference porque:
    //◦ Nossa expressão lambda satisfaz a interface funcional Function (recebe um argumento x e
    //retorna um valor double).
    //◦ A expressão lambda recebe um argumento x do tipo Integer, que possui o método
    //doubleValue que não recebe parâmetros.
    //◦ A expressão lambda é simples: somente possui uma chamada a um método.


}
