package concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Locks_ReadWriteLockInverted {

    //Se uma thread já possuir o lock de escrita, outras não conseguirão obter nem mesmo o lock de
    //leitura.

    static class Acao implements Runnable {

        private ReadWriteLock lock;

        public Acao(ReadWriteLock readWriteLock) {
            this.lock = readWriteLock;
        }

        @Override
        public void run() {
            Lock writeLock = lock.writeLock();
            if (writeLock.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName() + ": Conseguiu o Lock de escrita");
                } finally {
                    writeLock.unlock();
                }
            }

            Lock readLock = lock.readLock();
            if (readLock.tryLock()) {
               try {
                   System.out.println(Thread.currentThread().getName() + ": Conseguiu o Lock de leitura");
               } finally {
                   readLock.unlock();
               }
            }
        }
    }

    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();

        //Criação das threads
        Thread thread1 = new Thread(new Acao(lock));
        Thread thread2 = new Thread(new Acao(lock));
        Thread thread3 = new Thread(new Acao(lock));

        //Execução das treads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    //Thread-0: Conseguiu o Lock de escrita
    //Thread-0: Conseguiu o Lock de leitura

    //Perceba que neste exemplo o lock de escrita está sendo obtido antes do de leitura, de tal forma
    //que apenas a primeira thread que foi executada conseguiu obter os dois locks.
}
