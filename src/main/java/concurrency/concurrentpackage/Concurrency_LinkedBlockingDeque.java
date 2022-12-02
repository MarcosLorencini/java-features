package concurrency.concurrentpackage;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Concurrency_LinkedBlockingDeque {

    //É possível criar uma Fila Duplamente Ligada (Deque) que lança uma exceção após um tempo
    //predefinido utilizando a classe LinkedBlockingDeque.


    public static void main(String[] args) {
        BlockingDeque<String> queue = new LinkedBlockingDeque<String>();

        try {
            queue.offerFirst("ABC", 1, TimeUnit.SECONDS);
            queue.offerLast("DEF", 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Não conseguiu inserir em menos de 1 segundo");
        }

        try {
            queue.pollFirst(1, TimeUnit.SECONDS);
            queue.pollLast(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Não conseguiu remover em menos de 1 segundo");
        }
    }
}
