package concurrency.executetasks;

//Múltiplas Threads

//Todos os exemplos até agora utilizaram apenas uma thread adicional. Em todos eles, seria possível
//utilizar construtores de Executors que fornecem mais de uma thread

//É possível criar um Executor que cria threads conforme o necessário, e as reutiliza quando
//possível, utilizando o método newCachedThreadPool.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TasksMulti_CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = null;
        try {
            executor = Executors.newCachedThreadPool(); //executor com cache de treads
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
    //Tarefa 3 - Thread do Executor: pool-1-thread-3
    //Tarefa 4 - Thread do Executor: pool-1-thread-3
    //Tarefa 5 - Thread do Executor: pool-1-thread-3

    //Perceba que foram criadas 3 threads, e a terceira foi utilizada 3 vezes
}
