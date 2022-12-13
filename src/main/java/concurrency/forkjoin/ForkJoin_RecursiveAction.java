package concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkJoin_RecursiveAction {

    // É possível implementar uma RecursiveAction que divide uma tarefa grande em partes menores.

    //Classe qeu representa a tarefa que será executada
    static class ImpressaoDeStrings extends RecursiveAction {

        private String stringParaImprimir; // String que será impressa

        public ImpressaoDeStrings(String stringParaImprimir) {
            this.stringParaImprimir = stringParaImprimir;
        }

        @Override
        protected void compute() {
            if (stringParaImprimir.length() < 10) {
                //se a String tiver menos de 10 caracteres, sera impressa
                System.out.println(Thread.currentThread().getName() + " - " + stringParaImprimir);
            } else {
                //caso contrário, são criadas duas novas tarefas, uma com a primeira metade da String
                // e outra com a segunda metade da String
                List<ImpressaoDeStrings> novasTarefas = divideEmDuasTarefas();

                //Invoca a execução das duas tarefas criadas
                ForkJoinTask.invokeAll(novasTarefas);
            }

        }

        private List<ImpressaoDeStrings> divideEmDuasTarefas() {
            // esse método divide a String em duas partes e cria duas novas tarefas
            // cada uma das tarefas recebe uma parte da String
            int tamanhoDaString = stringParaImprimir.length();
            int meioDaString  = tamanhoDaString / 2;

            String primeiraMetade = stringParaImprimir.substring(0, meioDaString);
            String segundaMetade = stringParaImprimir.substring(meioDaString);

            List<ImpressaoDeStrings> acoes = new ArrayList<ImpressaoDeStrings>();
            acoes.add(new ImpressaoDeStrings(primeiraMetade));
            acoes.add(new ImpressaoDeStrings(segundaMetade));
            return acoes;
        }
    }

    public static void main(String[] args) {
        //string que queremos imprimir
        String stringParaImprimir = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //tarefa principal que será executada
        ImpressaoDeStrings tarefa = new ImpressaoDeStrings(stringParaImprimir);

        //criação do ForkJoinPoll e execução da tarefa
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(tarefa);

    }

    //ForkJoinPool-1-worker-3 - ABCDEF
    //ForkJoinPool-1-worker-1 - TUVWXYZ
    //ForkJoinPool-1-worker-5 - NOPQRS
    //ForkJoinPool-1-worker-7 - GHIJKLM

    //a. Esse exemplo cria uma tarefa do tipo RecursiveAction chamada ImpressaoDeStrings
    //b. Essa RecursiveAction recebe uma String para imprimir no Console.
    //No método compute, a tarefa decide se irá imprimir diretamente no console, ou se irá dividir
    //esse trabalho em duas partes: caso a String tenha menos que 10 caracteres, ela imprime
    //diretamente no Console; caso contrário, divide o trabalho em duas novas tarefas.
    //Perceba que cada impressão no console é realizada em uma thread diferente, ficando claro
    //que o trabalho está sendo compartilhado por múltiplas threads.
    //Perceba também que o processamento da String não retorna nenhum valor, e por isso foi
    //utilizada a classe RecursiveAction.

}
