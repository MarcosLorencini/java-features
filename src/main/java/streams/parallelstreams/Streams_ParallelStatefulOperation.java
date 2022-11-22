package streams.parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_ParallelStatefulOperation {

    //Operações intermediárias que alteram o estado de objetos podem gerar resultados inesperados
    //ao serem executadas em paralelo.

    public static void main(String[] args) {
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        List<String> list = Arrays.asList("A", "B", "C");

        System.out.println("Ordem no forEachOrdered: ");
        list.parallelStream()
                .map(s -> {synchronizedList.add(s); return s;})
                .forEachOrdered(System.out::println);

        System.out.println("Ordem na synchronizedList: ");
        for (String s : synchronizedList) {
            System.out.println(s);
        }
    }
}

//Ordem no forEachOrdered:
//A
//B
//C
//Ordem na synchronizedList:
//A
//C
//B

//Perceba que a ordem foi respeitada na última operação do Stream, o forEachOrdered, mas não foi
//respeitada na execução da operação intermediária map. Isso ocorre porque essa operação
//intermediária não precisa seguir a ordem dos itens do stream.


