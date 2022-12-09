package concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.*;

public class Schedule_SingleThreadCallable {

    //É possível agendar uma tarefa com retorno passando uma instância de Callable.

    public static void main(String[] args) {
        ScheduledExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadScheduledExecutor(); // executor de agendamento com uma única Thread
            System.out.println("Antes do agendamento: " + LocalTime.now());
            ScheduledFuture<String> retorno = executor.schedule(() -> "Execução: "
                    + LocalTime.now(), 3, TimeUnit.SECONDS);
            System.out.println("Depois do agendamento: " + LocalTime.now());

            System.out.println(retorno.get()); //fica parado agui esperando o retorno
            System.out.println("Depois da execução: " + LocalTime.now());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Erro ao fazer .get()");
        } finally {
            if ( executor != null ) {
                executor.shutdown();
            }
        }

        //Antes do agendamento: 17:53:28.884400800
        //Depois do agendamento: 17:53:28.890402100
        //Execução: 17:53:31.891784500
        //Depois da exeução: 17:53:31.893748700
    }
}
