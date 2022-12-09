package concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_LockTwice {

    //Uma thread pode obter mais de um lock no mesmo objeto Lock, mas deve desfazer o lock
    //múltiplas vezes também

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            lock.lock();
            System.out.println("ABC");
        } finally {
            lock.unlock(); // desfaz o primeiro lock
            lock.unlock(); // desfaz o segundo locl
        }
    }

    //ABC

    //Como a thread chamou lock duas vezes, caso ela não houvesse chamado unlock duas vezes,
    //outra thread não seria capaz de obter o lock.
}
