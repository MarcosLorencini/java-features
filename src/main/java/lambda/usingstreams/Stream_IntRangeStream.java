package lambda.usingstreams;

import java.util.stream.IntStream;

public class Stream_IntRangeStream {

    //É possível criar um Stream a partir de uma faixa de números utilizando o método
    //IntStream.range().

    public static void main(String[] args) {
        IntStream.range(0,4).forEach(System.out::println);
    }
    //0
    //1
    //2
    //3

    //Perceba que o primeiro argumento (número 0) é inclusivo, enquanto o segundo argumento
    //(número 4) é exclusivo. Por isso a saída no console apresenta apenas os números 0 a 3
}
