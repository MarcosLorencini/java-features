package concurrency.executetasks;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Tasks_SingleThreadCallable {

    //É possível retornar um valor da tarefa utilizando o método submit que recebe uma instância de
    //Callable

    public static void main(String[] args) {

        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();
            Future<?> retornoDaTarefa = executor.submit(() -> "String que será retornada");

            //O .get() abaixo irá esperar a tarefa finalizar para pegar seu retorno
            System.out.println("Retorno da tarefa: " + retornoDaTarefa.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Execução interrompida.");
        } finally {
            if( executor != null) {
                executor.shutdown();
            }
        }

        //Nesse caso a instância de Future representa o valor retornado pela tarefa, uma String.
        //É necessário o bloco catch para capturar as exceções que podem ser lançadas pelo método get
        //da classe Future.

    }


}
