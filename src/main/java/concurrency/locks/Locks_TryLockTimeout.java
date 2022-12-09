package concurrency.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLockTimeout {

    //Também é possível tentar obter um lock definindo um tempo de espera máximo.

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        boolean temLock = false;

        try {
            //tenta obter o lock por no máximo 1 segundo
            temLock = lock.tryLock(1, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            System.out.println("Não obteve o Lock");
        }

        if (temLock) {
            try {
                System.out.println("ABC");
            } finally {
                lock.unlock(); //desfaz o lock
            }
        } else {
            System.out.println("DEF");
        }

        //ABC


    }
}
