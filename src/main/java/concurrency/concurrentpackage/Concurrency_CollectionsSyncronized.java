package concurrency.concurrentpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrency_CollectionsSyncronized {

    //É possível criar versões syncronized de coleções utilizando métodos utilitários da classe
    //Collections.
    public static void main(String[] args) {

        // Concurrent Map, garante o acesso de múltiplas threads
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        // Map Comum, NÃO garante o acesso de múltiplas threads
        Map<String, String> map =  new HashMap<>();

        // Syncronized Map, garante o acesso de múltiplas threads
        Map<String, String> synchronizedMap = Collections.synchronizedMap(map);


    }
}
