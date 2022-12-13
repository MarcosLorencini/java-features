package concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TasksMulti_ScheduledThreadPool {

    //É possível criar um Executor de agendamento com um número delimitado de threads utilizando
    //o método newScheduledThreadPool.

    public static void main(String[] args) {
        ScheduledExecutorService executor = null;
        try {
            executor = Executors.newScheduledThreadPool(2); // executor de agendamento com duas threads
            System.out.println("Agora: " + LocalTime.now()); // imprime a hora atual

            executor.schedule(() -> System.out.println("Execução 1: " + Thread
                    .currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
            executor.schedule(() -> System.out.println("Execução 2: " + Thread
                    .currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
            executor.schedule(() -> System.out.println("Execução 3: " + Thread
                    .currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
            executor.schedule(() -> System.out.println("Execução 4: " + Thread
                    .currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
            executor.schedule(() -> System.out.println("Execução 5: " + Thread
                    .currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }

        //Agora: 10:35:00.024059100
        //Execução 1: pool-1-thread-1 - 10:35:03.043176600
        //Execução 3: pool-1-thread-1 - 10:35:03.059178600
        //Execução 4: pool-1-thread-1 - 10:35:03.059178600
        //Execução 2: pool-1-thread-2 - 10:35:03.043176600
        //Execução 5: pool-1-thread-1 - 10:35:03.060185

        //Duas threads e delay de 3 segundos em todos os agendamentos.
    }
}
