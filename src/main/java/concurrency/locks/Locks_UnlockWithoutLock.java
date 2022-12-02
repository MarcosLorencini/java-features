package concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_UnlockWithoutLock {

    //Chamar o método unlock sem ter obtido um lock anteriormente irá lançar uma exceção.

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        try {
            System.out.println("ABC");
        } finally {
            lock.unlock(); // lança exceção, pois não há lock
        }

    }

    //ABC
    //Exception in thread "main" java.lang.IllegalMonitorStateException
    //	at java.base/java.util.concurrent.locks.ReentrantLock$Sync.tryRelease(ReentrantLock.java:175)
    //	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.release(AbstractQueuedSynchronizer.java:1006)
    //	at java.base/java.util.concurrent.locks.ReentrantLock.unlock(ReentrantLock.java:494)
    //	at concurrency.locks.Locks_UnlockWithoutLock.main(Locks_UnlockWithoutLock.java:15)

}
