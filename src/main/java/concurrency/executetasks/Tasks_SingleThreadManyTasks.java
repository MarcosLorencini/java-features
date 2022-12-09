package concurrency.executetasks;


import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Tasks_SingleThreadManyTasks {

    //É possível executar várias tarefas em uma mesma thread separada utilizando o mesmo método
    //newSingleThreadExecutor.

    public static void main(String[] args) {

        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor(); //executor com uma única thread

            executor.execute(() -> System.out.println("Tarefa 1 - Thread do Executor: " +
                    Thread.currentThread().getName()));

            executor.execute(() -> System.out.println("Tarefa 2 - Thread do Executor: " +
                    Thread.currentThread().getName()));

            executor.execute(() -> System.out.println("Tarefa 3 - Thread do Executor: " +
                    Thread.currentThread().getName()));

            System.out.println("Thread Principal: " + Thread.currentThread().getName());
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }

        //Thread Principal: main
        //Tarefa 1 - Thread do Executor: pool-1-thread-1
        //Tarefa 2 - Thread do Executor: pool-1-thread-1
        //Tarefa 3 - Thread do Executor: pool-1-thread-1

        //Perceba que todas as tarefas foram executadas pela mesma thread, que é diferente e paralela à
        //thread principal.

    }
}
