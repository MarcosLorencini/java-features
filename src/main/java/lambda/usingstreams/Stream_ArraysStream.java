package lambda.usingstreams;

import java.util.Arrays;

public class Stream_ArraysStream {

    //Criando um Stream
    //Geralmente, um Stream é criado a partir de um conjunto de dados, como uma lista ou outro tipo de
    //coleção. O objetivo da certificação deixa explícito que é necessário conhecer os métodos
    //Arrays.stream() e IntStream.range(). Mas, além dessas, serão apresentadas também algumas outras
    //formas comuns de criar um Stream.

    //É possível criar um Stream a partir de um Array utilizando o método Arrays.stream().

    public static void main(String[] args) {
        String[] array = new String[] {"A", "B", "C"};

        Arrays.stream(array).forEach(System.out::println);
    }






}
