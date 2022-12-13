package concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThreadFixedDelay {

    //É possível agendar uma tarefa para ser executada X tempo após o término da tarefa anterior
    //usando o método scheduleWithFixedDelay.

    public static void main(String[] args) {
        ScheduledExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadScheduledExecutor(); // executor de agendamento com uma única thread
            System.out.println("Antes do agendamento: " + LocalTime.now()); // imprime a hora atual
            executor.scheduleWithFixedDelay(() -> System.out.println("Execução: "
                    + LocalTime.now()), 3, 1, TimeUnit.SECONDS);
            System.out.println("Após do agendamento: " + LocalTime.now()); //imprime a hora atual
            sleep(); // aguarda um tempo para ser possível enxergar as execuções
            System.out.println("Após o sleep de 10 segundos: " + LocalTime.now()); // imprime a hora atual
        } finally {
            if (executor != null) {
                System.out.println("Invocando shutdown no executor");
                executor.shutdown();;
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Antes do agendamento: 16:20:46.717
    //Após do agendamento: 16:20:46.727
    //Execução: 16:20:49.728
    //Execução: 16:20:50.729
    //Execução: 16:20:51.729
    //Execução: 16:20:52.730
    //Execução: 16:20:53.731
    //Execução: 16:20:54.732
    //Execução: 16:20:55.732
    //Após o sleep de 10 segundos: 16:20:56.728
    //Invocando shutdown no executor.

    //Este exemplo é muito parecido com o anterior, porém há uma diferença importante: a nova
    //tarefa só começa a executar 1 segundo depois do término da anterior. No exemplo acima a
    //tarefa era executada a cada 1 segundo, independente do término da anterior. Perceba as
    //diferenças nos milissegundos.
}
