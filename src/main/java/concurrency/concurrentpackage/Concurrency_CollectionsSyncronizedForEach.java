package concurrency.concurrentpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Concurrency_CollectionsSyncronizedForEach {

    //Não é possível adicionar ou remover elementos durante o forEach de uma coleção sincronizada
    //que foi criada utilizando o método da classe Collections.

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> synchrozinedMap = Collections.synchronizedMap(map);

        for (Map.Entry<Integer, String> entry : synchrozinedMap.entrySet()) {
            synchrozinedMap.remove(1);
        }
    }

    //Perceba que, apesar do Map ter sido transformado em syncronized, não é possível alterá-lo
    //durante uma iteração com forEach. Isso é possível apenas nas versões Concurrent das coleções.

    //Exception in thread "main" java.util.ConcurrentModificationException
    //	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1584)
    //	at java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1617)
    //	at java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1615)
    //	at concurrency.concurrentpackage.Concurrency_CollectionsSyncronizedForEach.main(Concurrency_CollectionsSyncronizedForEach.java:20)
}
