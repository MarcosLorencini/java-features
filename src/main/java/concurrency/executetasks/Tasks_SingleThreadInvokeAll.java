package concurrency.executetasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

public class Tasks_SingleThreadInvokeAll {

    //. É possível passar uma lista de tarefas para serem executadas utilizando o método invokeAll.

    public static void main(String[] args) {
        List<Callable<String>> tarefas = new ArrayList<Callable<String>>();
        tarefas.add(() -> "Tarefa 1 executando na thread " + Thread.currentThread().getName());
        tarefas.add(() -> "Tarefa 2 executando na thread " + Thread.currentThread().getName());
        tarefas.add(() -> "Tarefa 3 executando na thread " + Thread.currentThread().getName());

        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();

            //invokeAll devolve todos os retornos das tarefas executadas em uma lista
            List<Future<String>> retornos = executor.invokeAll(tarefas);

            for( Future<String> retorno : retornos) {
                System.out.println("Retorno da tarefa: " +  retorno.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Execução interrompida");
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }
    }

    //Retorno da tarefa: Tarefa 1 executando na thread pool-1-thread-1
    //Retorno da tarefa: Tarefa 2 executando na thread pool-1-thread-1
    //Retorno da tarefa: Tarefa 3 executando na thread pool-1-thread-1
}
