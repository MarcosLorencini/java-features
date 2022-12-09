package concurrency.executetasks;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Tasks_SingleThreadFuture {

    //Também é possível ver outras informações sobre a tarefa ou tentar cancelar sua execução.

    public static void main(String[] args) {

        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();
            Future<?> tarefa = executor.submit(() -> System.out.println("Tarefa executando"));

            //verifica se a tarefa já está finalizada
            System.out.println("Tarefa já finalizada ? " + tarefa.isDone());

            //tenta cancelar a tarefa
            System.out.println("Tentando cancelar a tarefa. Conseguiu? " + tarefa.cancel(true));

            //verifica se a tarefa foi cancelada
            System.out.println("Tarefa foi cancelada ? " + tarefa.isCancelled());
        } finally {
            if (executor != null ) {
                executor.shutdown();
            }
        }
    }

    //Tarefa já finalizada? false
    //Tentando cancelar a tarefa. Conseguiu? true
    //Tarefa executando
    //Tarefa foi cancelada? true

    //Perceba como foi possível cancelar a tarefa mesmo após ela já ter impresso no console.
    //O resultado desse exemplo também será diferente para cada execução.


}
