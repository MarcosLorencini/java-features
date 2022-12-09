package concurrency.executetasks;

//Tarefas agendadas


import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThread {

    /// É possível agendar tarefas com as classes de ScheduledExecutorService.

    public static void main(String[] args) {
        ScheduledExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadScheduledExecutor();// executor de agendamento com uma única thread
            System.out.println("Agora: " + LocalTime.now());// imprime a hora atual
             executor.schedule(() -> System.out.println("Execução: " + LocalTime.now()), 3, TimeUnit.SECONDS);
        } finally {
            if ( executor != null) {
                executor.shutdown();
            }
        }

        //Agora: 17:44:49.125382900
        //Execução: 17:44:52.141657900

        //Perceba que a tarefa foi executada aproximadamente 3 segundos após o agendamento.
        //O método schedule utilizado neste exemplo recebe um Runnable, por isso não há retorno na
        //expressão lambda.
        //Ao agendar uma tarefa, o programa só encerra após a execução, cancelamento ou interrupção
        //da tarefa.


    }
}
