package concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLock {

    //É possível tentar obter um lock imediatamente utilizando o método tryLock.

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        boolean temLock = lock.tryLock();

        if (temLock) {
            try {
                System.out.println("ABC");
            } finally {
                lock.unlock(); // desfaz um lock
            }
        } else {
            System.out.println("DEF");
        }
    }

    //ABC
}
