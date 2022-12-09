package concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_Fair {

    //É possível garantir uma distribuição mais "justa" de locks passando true como argumento para
    //o ReentrantLock.
    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true); // lock "justo"
        try {
            lock.lock();
            System.out.println("ABC");
        } finally {
            lock.unlock(); // desfaz o lock
        }
    }

    //Ao passar o argumento true, quando várias threads estiverem esperando pelo mesmo lock, ele
    //será dado àquela thread que está aguardando a mais tempo.

}
