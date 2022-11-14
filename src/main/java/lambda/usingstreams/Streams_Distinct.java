package lambda.usingstreams;

import java.util.Arrays;

public class Streams_Distinct {

    //É possível filtrar elementos repetidos do Stream utilizando a operação distinct.

    public static void main(String[] args) {
        // Criação de um array comum de Strings
        String[] array = new String[] {"A", "B", "C", "A", "B", "F"};

        Arrays.stream(array)
                .distinct() // ignora elementos repetidos
                .forEach(System.out::println);
    }

    //A
    //B
    //C
    //F

    //Perceba que nesse caso os elementos repetidos do stream ("A" e "B") foram ignorados, sendo
    //apresentados apenas uma vez.
    //A operação distinct utiliza os método equals e hashCode, então tenha certeza de que eles estão
    //implementados corretamente caso esteja utilizando um tipo de objeto criado por você. No
    //exemplo foram utilizados objetos do tipo String, que já possuem essa implementação por
    //padrão.


}
