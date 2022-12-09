package concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tasks_ShutdownNow {

    //É possível chamar shutdownNow para tentar encerrar todas as threads imediatamente.

    public static void main(String[] args) {
        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();
            executor.execute(() -> System.out.println("Thread do Executor: " + Thread.currentThread().getName()));
            System.out.println("Thread Principal: " + Thread.currentThread().getName());
        } finally {
            if(executor != null) {
                executor.shutdownNow(); // TENTA encerrar todas a threads imediatamento
            }
        }
    }

    //Thread do Executor: pool-1-thread-1
    //Thread Principal: main

}
