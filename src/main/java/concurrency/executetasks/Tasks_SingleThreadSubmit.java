package concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadSubmit {

    //É possível utilizar o método submit para ter informações sobre a tarefa que está sendo
    //executada.

    public static void main(String[] args) {

        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();
            Future<?> tarefa = executor.submit(() -> System.out.println("Thread do Executor: "
                    + Thread.currentThread().getName()));

            System.out.println("Tarefa já finalizada? " + tarefa.isDone());
            System.out.println("Tarefa já finalizada? " + tarefa.isDone());
            System.out.println("Tarefa já finalizada? " + tarefa.isDone());
            System.out.println("Tarefa já finalizada? " + tarefa.isDone());
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }

        //Thread do Executor: pool-1-thread-1
        //Tarefa já finalizada? false
        //Tarefa já finalizada? true
        //Tarefa já finalizada? true
        //Tarefa já finalizada? true

        //A instância de Future representa um valor que será retornado no futuro. Nesse caso é um valor
        //que representa a própria tarefa submetida.
        //Veja que a tarefa inicialmente ainda não havia sido finalizada, mas nas duas últimas impressões
        //no console já havia sido.
        //O resultado desse exemplo irá ser diferente para cada execução, tendo em vista a utilização de
        //mais de uma thread: a principal e uma paralela.
    }
}
