package concurrency.concurrentpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Concurrency_LinkedBlockingQueue {

    //É possível criar uma Fila que lança uma exceção após um tempo predefinido utilizando a classe
    //LinkedBlockingQueue

    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>();

        try{
            //Inserts the specified element into this queue, waiting up to the specified wait time if necessary
            // for space to become available.
            queue.offer("ABC", 1, TimeUnit.SECONDS);
        }catch (InterruptedException e) {
            System.out.println("Não conseguiu inserir em menos de 1 segundo.");
        }

        try {
            //Retrieves and removes the head of this queue, waiting up to the specified wait time if necessary
            // for an element to become available
            queue.poll(1, TimeUnit.SECONDS);
        }catch (InterruptedException e) {
            System.out.println("Não conseguiu remover em nos de 1 segundo.");
        }

    }
}
