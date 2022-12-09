package concurrency.executetasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Tasks_SingleThreadAwaitTermination {

    //É possível esperar as tarefas finalizarem sua execução por um tempo específico com o método
    //awaitTermination.

    public static void main(String[] args) {
        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();

            executor.execute(() -> System.out.println("Tarefa 1 - Thread do Executor: " + Thread.currentThread().getName()));
            executor.execute(() -> System.out.println("Tarefa 2 - Thread do Executor: " + Thread.currentThread().getName()));
            executor.execute(() -> System.out.println("Tarefa 3 - Thread do Executor: " + Thread.currentThread().getName()));
        } finally {
            if( executor != null ) {
                executor.shutdown();
            }
        }

        if( executor != null ) {
            try {
                System.out.println("Tarefas finalizadas? " + executor.isTerminated());
                executor.awaitTermination(1, TimeUnit.SECONDS);
                System.out.println("Tarefas finalizadas? " + executor.isTerminated());
            } catch (InterruptedException e) {
                System.out.println("Erro de interrupção");
            }
        }

        //Tarefa 1 - Thread do Executor: pool-1-thread-1
        //Tarefa 2 - Thread do Executor: pool-1-thread-1
        //Tarefa 3 - Thread do Executor: pool-1-thread-1
        //Tarefas finalizadas? false
        //Tarefas finalizadas? true

        //Caso as tarefas não tenham terminado depois de 1 segundo, a execução teria continuado
        //normalmente. Não há exceção neste caso. A única diferença seria a saída no console, pois nas
        //duas vezes seria impresso false.
    }
}
