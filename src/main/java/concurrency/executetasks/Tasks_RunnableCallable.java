package concurrency.executetasks;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Tasks_RunnableCallable {

    //Runnable não possui retorno nem pode lançar exceção checada, enquanto Callable possui
    //retorno e pode lançar exceção checada. É importante saber diferenciar qual versão do método
    //submit está sendo chamado.

    public static void main(String[] args) {

        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();

            //tarefa sem retorno, instância de Runnable
            executor.submit(() -> System.out.println("Runnable"));

            //tarefa com retorno, instância de Callable
            executor.submit(() -> "Callable");

            //tarefa que lança um Exception deve ser Callable, logo deve ter retorno
            executor.submit(() -> {Thread.sleep(1); return "Callable" ;});

            //tarefa que lança um Exception, mas não declara retorno
            //NÃO COMPILA pois é interpretada como Runnable
           // executor.submit(() -> Thread.sleep(1));
        } finally {
            if (executor != null ) {
                executor.shutdown();
            }
        }

        //Lembre-se que Thread.sleep() lança uma exceção checada.
    }
}
