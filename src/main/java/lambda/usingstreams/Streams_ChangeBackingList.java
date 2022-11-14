package lambda.usingstreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams_ChangeBackingList {

    //O Stream só será criado de fato depois que alguma operação for executada nele

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stream<Integer> stream = list.stream();
        list.add(4);

        stream.forEach(System.out::println);

        //1
        //2
        //3
        //4

    }

    //Perceba que, mesmo que o Stream aparentemente tenha sido criado antes de adicionar o
    //número 4 na lista, ele imprime esse número no console. Isso acontece porque o Stream só foi
    //criado de fato quando alguma operação foi feita nele, ou seja, quando o forEach foi invocado.


}
