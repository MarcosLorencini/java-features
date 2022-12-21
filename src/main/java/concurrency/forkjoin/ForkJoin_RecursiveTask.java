package concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoin_RecursiveTask {

    //Caso seja necessário retornar um valor, é possível implementar uma RecursiveTask que divide
    //uma tarefa grande em partes menores.

    //classe que representa a tarefa que será executada
    static class ImpressaoDeStrings extends RecursiveTask<Integer> {

        private String stringParaImprimir; //String que será impressa

        public ImpressaoDeStrings(String stringParaImprimir) {
            this.stringParaImprimir = stringParaImprimir;
        }

        @Override
        protected Integer compute() {
            if(stringParaImprimir.length() < 10) {
                // se a String tiver menos de 10 caracteres, será impressa
                System.out.println(Thread.currentThread().getName() + " - " + stringParaImprimir);
                //retorna a quantidade de caracteres impressos
                return stringParaImprimir.length();
            } else {
                //caso contrário, são criados duas novas tarefas, uma com a primeira metada da String e a outra
                //com a segunda metade da String
                List<ImpressaoDeStrings> novasTarefas = divideEmDuasTarefas();
                ImpressaoDeStrings tarefa1 = novasTarefas.get(0);
                ImpressaoDeStrings tarefa2 = novasTarefas.get(1);

                // 'fork' irá enviar a tarefa1 para ser executada em uma nova thread
                ForkJoinTask<Integer> primeiraTarefa = tarefa1.fork();

                //'compute' irá executar a tarefa2 nessa mesma thread
                Integer resultadoDaTarefa2 = tarefa2.compute();

                // 'join' irá pegar o resultado da tarefa1 que estava sendo executada em outra thread
                Integer resultadoDaTarefa1 = primeiraTarefa.join();

                // retornamos a soma dos resultados, pois é a quantidade de caracteres impressos
                return resultadoDaTarefa2 + resultadoDaTarefa1;
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
        // string que queremos imprimir
        String stringParaImprimir = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //tarefas principal que será executada
        ImpressaoDeStrings tarefa = new ImpressaoDeStrings(stringParaImprimir);

        //criação do ForkJoinPool e execução da tarefa
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Integer resultado = forkJoinPool.invoke(tarefa);
        System.out.println("Resultado da execução: " + resultado);

    }

    //a. Esse exemplo cria uma tarefa do tipo RecursiveTask chamada ImpressaoDeStrings.
    //b. Essa RecursiveTask recebe uma String para imprimir no Console.
    //c. No método compute, a tarefa decide se irá imprimir diretamente no console, ou se irá dividir
    //esse trabalho em duas partes: caso a String tenha menos que 10 caracteres, ela imprime
    //diretamente no Console; caso contrário, divide o trabalho em duas novas tarefas.
    //Perceba também que o processamento da String retorna quantos caracteres foram
    //impressos, e por isso foi utilizada a classe RecursiveTask.
}
