package concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TasksMulti_FixedThreadPool {

    //É possível criar um Executor com um número delimitado de threads utilizando o método
    //newFixedThreadPool.

    public static void main(String[] args) {
            ExecutorService executor = null;
            try {
                executor = Executors.newFixedThreadPool(2); //executor com duas treads
                executor.execute(() -> System.out.println("Tarefa 1 - Thread do Executor: " + Thread.currentThread().getName()));
                executor.execute(() -> System.out.println("Tarefa 2 - Thread do Executor: " + Thread.currentThread().getName()));
                executor.execute(() -> System.out.println("Tarefa 3 - Thread do Executor: " + Thread.currentThread().getName()));
                executor.execute(() -> System.out.println("Tarefa 4 - Thread do Executor: " + Thread.currentThread().getName()));
                executor.execute(() -> System.out.println("Tarefa 5 - Thread do Executor: " + Thread.currentThread().getName()));
            } finally {
                if (executor != null ) {
                    executor.shutdown();            }
            }
        }

    //Tarefa 1 - Thread do Executor: pool-1-thread-1
    //Tarefa 2 - Thread do Executor: pool-1-thread-2
    //Tarefa 3 - Thread do Executor: pool-1-thread-1
    //Tarefa 4 - Thread do Executor: pool-1-thread-2
    //Tarefa 5 - Thread do Executor: pool-1-thread-1
}
