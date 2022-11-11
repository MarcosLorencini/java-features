package lambda.methodreference;

import java.util.function.Function;

public class MethodReference_Static {

    //Chamadas a métodos estáticos em expressões lambda podem virar uma referência ao método.

    public static void main(String[] args) {
        // representação com expressão lambda
        Function<Integer, String> converteIntEmStr1 = x -> String.valueOf(x);

        // representação com referência ao método
        Function<Integer, String> converteIntEmStr2 = String::valueOf;;

        System.out.println(converteIntEmStr1.apply(5));
        System.out.println(converteIntEmStr2.apply(5));

    }

    //Nesse caso a única coisa que a expressão lambda faz é receber um argumento x e repassar para
    //o método valueOf de String. Para simplificar isso, o Java 8 permite que você escreva essa mesma
    //função lambda como foi apresentado na linha seguinte: String::valueOf.
    //Só é possível representar a primeira expressão lambda na forma de um method reference
    //porque:
    //◦ A implementação de String.valueOf satisfaz a interface funcional Function (recebe um
    //argumento e retorna um valor).
    //◦ O argumento de entrada da expressão lambda x é exatamente o mesmo passado para o
    //método String.valueOf(x).
    //◦ A expressão lambda é simples: somente possui uma chamada a um método.
}
