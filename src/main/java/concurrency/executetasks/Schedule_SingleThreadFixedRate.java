package concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThreadFixedRate {

    //É possível agendar uma tarefa para ser executada a cada X tempo usando o método
    //scheduleAtFixedRate.

    public static void main(String[] args) {
        ScheduledExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadScheduledExecutor(); // executor de agendamento com uma thread
            System.out.println("Antes do agendamento: " + LocalTime.now()); // imprime a hora atual
            executor.scheduleAtFixedRate(() -> System.out.println("Execução: " + LocalTime
                    .now()), 3, 1, TimeUnit.SECONDS);
            System.out.println("Após agendamento: " + LocalTime.now()); // imprime a hora atual
            sleep(); // aguarda um tempo para se possível enxergar as execuções
            System.out.println("Após o sleep de 10 segundos: " + LocalTime.now()); // imprime a hora atual
        } finally {
            if (executor != null) {
                System.out.println("Invocando shutdown no executor");
                executor.shutdown();
            }
        }
    }

    //Neste exemplos a execução demora 3 segundos para começar, e é repetida a cada 1 segundo, até
    //o shutdown ser chamado. Por isso existe um sleep no final do bloco try, para garantir que
    //enxergaríamos a execução da tarefa por algumas vezes antes de invocar o shutdown.

    //Antes do agendamento: 18:46:39.339284900
    //Após agendamento: 18:46:39.345286300
    //Execução: 18:46:42.356917900
    //Execução: 18:46:43.350296
    //Execução: 18:46:44.355631800
    //Execução: 18:46:45.348305300
    //Execução: 18:46:46.353835200
    //Execução: 18:46:47.359372200
    //Execução: 18:46:48.351468900
    //Execução: 18:46:49.351263800
    //Após o sleep de 10 segundos: 18:46:49.351263800
    //Invocando shutdown no executor

    private static void sleep() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
