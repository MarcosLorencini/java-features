package concurrency.executetasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Tasks_SingleThreadInvokeAny {

    //É possível passar uma lista de tarefas onde apenas uma será concluída utilizando o método
    //invokeAny

    public static void main(String[] args) {
        List<Callable<String>> tarefas = new ArrayList<Callable<String>>();
        tarefas.add(() -> "Tarefa 1 executada na thread " + Thread.currentThread().getName());
        tarefas.add(() -> "Tarefa 2 executada na thread " + Thread.currentThread().getName());
        tarefas.add(() -> "Tarefa 3 executada na thread " + Thread. currentThread().getName());

        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();

            //invokeAny devolve apenas uma das tarefas que finalizou e interrompe as outras
            String retorno  = executor.invokeAny(tarefas);
            System.out.println("Retorno da tarefa: " + retorno);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Execução interrompida");
        } finally {
            if (executor != null ) {
                executor.shutdown();
            }
        }

    }

    //Retorno da tarefa: Tarefa 1 executada na thread pool-1-thread-1

    //As outras tarefas são interrompidas ou, como neste caso só temos uma thread, nem são
    //executadas.
    //Em um exemplo com inúmeras threads, é possível que qualquer uma das 3 tarefas finalize
    //primeiro e interrompa as outras duas.
}
