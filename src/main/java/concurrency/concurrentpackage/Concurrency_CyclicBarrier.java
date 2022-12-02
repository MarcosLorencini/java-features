package concurrency.concurrentpackage;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Concurrency_CyclicBarrier {

    //É possível sincronizar a execução de várias threads utilizando a classe CyclicBarrier.

    static class Acao implements Runnable {

        CyclicBarrier cyclicBarrier;

        public Acao(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": Primeira Parte");

            try {
                cyclicBarrier.await(); //sincronização das threads
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ": Segunda Parte");

            try {
                cyclicBarrier.await(); //sincronização das threads
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ": Terceira Parte");

        }

        public static void main(String[] args) {
            //Criação de um CyclicBarrier para 3 trheads
            CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

            //Criação da threads
            Thread thread1 =  new Thread(new Acao(cyclicBarrier));
            Thread thread2 =  new Thread(new Acao(cyclicBarrier));
            Thread thread3 =  new Thread(new Acao(cyclicBarrier));

            //Inicio de execução das threads
            thread1.start();
            thread2.start();
            thread3.start();
        }

        //Thread-2: Primeira Parte
        //Thread-1: Primeira Parte
        //Thread-0: Primeira Parte
        //Thread-1: Segunda Parte
        //Thread-2: Segunda Parte
        //Thread-0: Segunda Parte
        //Thread-0: Terceira Parte
        //Thread-1: Terceira Parte
        //Thread-2: Terceira Parte

        //Neste exemplo estão sendo criadas 3 threads. Todas executam instâncias da classe Acao que
        //recebem a mesma instância da classe CyclicBarrier. Toda vez que uma thread faz uma chamada
        //ao método await da instância de cyclicBarrier, ela fica suspensa até que todas as outras threads
        //cheguem até aquele mesmo ponto. Por isso todas as threads imprimem no console de forma
        //sincronizada. Se não houvesse sincronização, a saída no console seria completamente
        //imprevisível. Abaixo é o exemplo de uma execução sem a chamada ao método await:

        //Saída no console caso não houvesse CyclicBarrier

        //Thread-0: Primeira Parte
        //Thread-1: Primeira Parte
        //Thread-1: Segunda Parte
        //Thread-1: Terceira Parte
        //Thread-2: Primeira Parte
        //Thread-0: Segunda Parte
        //Thread-2: Segunda Parte
        //Thread-0: Terceira Parte
        //Thread-2: Terceira Parte



    }
}
