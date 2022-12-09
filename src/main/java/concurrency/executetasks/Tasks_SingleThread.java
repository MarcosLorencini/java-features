package concurrency.executetasks;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tasks_SingleThread {

    //É possível executar uma tarefa em uma thread separada utilizando o método
    //newSingleThreadExecutor.


    public static void main(String[] args) {

        ExecutorService executor = null;


        try {
            executor = Executors.newSingleThreadExecutor(); // executor com uma única thread
            executor.execute(() -> System.out.println("Thread do Executor: " + Thread.currentThread().getName()));
            System.out.println("Thread Principal: " + Thread.currentThread().getName());
        } finally {
            if (executor != null ) {
                executor.shutdown();
            }
        }
    }

    //Thread Principal: main
    //Thread do Executor: pool-1-thread-1

    //O método execute recebe uma instância de Runnable, que nestes exemplos serão criadas na
    //forma de uma expressão lambda.
    //Perceba que a thread utilizada pelo executor é diferente da thread principal.
    //Perceba também que é boa prática chamar o método shutdown dentro de um bloco finally,
    //buscando não deixar threads pendentes. Fique atento, pois chamar o método shutdown não
    //garante que a threads foram finalizadas.
    //Em um programa real, talvez você não queira que a tarefa seja finalizada logo após a sua
    //criação, como nos exemplos aqui apresentados. Logo, pode ser necessário invocar o shutdown em
    //algum ponto do sistema, ou quando a aplicação for encerrada. Apenas lembre-se de invocar o
    //método shutdown para que sua aplicação possa ser encerrada corretamente, caso contrário o
    //processo poderá ficar travado impedindo que o programe encerre corretamente..
}
