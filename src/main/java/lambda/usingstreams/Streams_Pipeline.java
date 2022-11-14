package lambda.usingstreams;

import java.util.stream.IntStream;

public class Streams_Pipeline {

    //Pipeline:

    //É possível criar um pipeline com várias operações em um único Stream

    public static void main(String[] args) {
        IntStream.range(0, 10) // Stream de 0 a 9
                .filter(e -> e % 2 == 0)  // mantém apenas números pares
                .skip(2) // ignora os dois primeiros
                .limit(2) // limita a 3 elementos
                .map(e -> e * 2) // multipla cada elemento por 2
                .forEach(System.out::println); // imprime cada elemento

        //8
        //12
    }

    //Para entender todas as operações realizadas nesse pipeline, é necessário entender passo a
    //passo:
    //a. Foi criado um Stream contendo todos os números de 0 a 9
    //b. Foi aplicado um filtro mantendo apenas os números pares: 0, 2, 4, 6 e 8
    //c. Foram ignorados os dois primeiros números, mantendo apenas: 4, 6 e 8
    //d. Foi limitado o processamento aos dois primeiros números: 4 e 6
    //e. Foi aplicada uma multiplicação por 2 em cada elemento, resultando em: 8 e 12
    //f. Os dois elementos foram impressos no console.


}
