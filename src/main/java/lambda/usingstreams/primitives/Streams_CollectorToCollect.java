package lambda.usingstreams.primitives;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToCollect {

    //É possível utilizar um Collector para armazenar os elementos de um Stream em uma nova
    //coleção.

    public static void main(String[] args) {
        // Armazena o resultado do Stream em um ArrayList
        Collection<Integer> collect = Stream.of(1, 2, 3, 4)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("ArrayList: " + collect);

        // Armazena o resultado do Stream em um HashSet
        Collection<Integer> collect2 = Stream.of(1, 2, 3, 4)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println("HashSet: " + collect2);

        // Armazena o resultado do Stream em uma LinkedList
        Collection<Integer> collect3 = Stream.of(1, 2, 3, 4)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("LinkedList: " +collect3);

        // Armazena o resultado do Stream em um TreeSet
        Collection<Integer> collect4 = Stream.of(1, 2, 3, 4)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet: " +collect4);




    }
}
