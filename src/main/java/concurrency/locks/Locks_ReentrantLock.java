package concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_ReentrantLock {

    //Reentrant Lock

    //É possível adquirir um Lock utilizando a classe ReentrantLock.

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try {
            lock.lock(); //apenas uma thread obtém o lock por vez
            System.out.println("ABC");
        } finally {
            lock.unlock(); //desfaz o lock
        }
    }
    //ABC

    //Perceba que o lock é removido dentro de um bloco finally. Isso garante que uma thread não irá
    //ficar com um lock indeterminadamente.



}
