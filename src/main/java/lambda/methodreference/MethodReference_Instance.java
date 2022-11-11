package lambda.methodreference;

import java.util.function.BiFunction;

public class MethodReference_Instance {

    //Chamadas a métodos de uma instância específica também podem ser representados como uma
    //referência a um método.

    static class Conversor {
        public String converter(Integer x, Integer y) {
            return String.valueOf(x) + " - " + String.valueOf(y);
        }
    }

    public static void main(String[] args) {
        Conversor conversor = new Conversor(); // instância da classe Conversor

        // representação com expressão lambda
        BiFunction<Integer, Integer, String> converte1 = (x, y) -> conversor.converter(x ,y);

        // representação com referência ao método da instância
        BiFunction<Integer, Integer, String> converter2 = conversor::converter;

        System.out.println(converte1.apply(5,8));
        System.out.println(converter2.apply(5,8));
    }

    //Só é possível representar a primeira expressão lambda na forma de um method reference
    //porque:
    //◦ A implementação de Conversor.converte(Integer, Integer) satisfaz a interface funcional
    //BiFunction (recebe dois argumentos e retorna um valor).
    //◦ Os argumentos de entrada da expressão lambda x e y são exatamente os mesmos passados
    //para o método Conversor.converte(Integer, Integer).
    //◦ A expressão lambda é simples: somente possui uma chamada a um método.




}
