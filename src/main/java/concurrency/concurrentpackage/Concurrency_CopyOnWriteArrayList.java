package concurrency.concurrentpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrency_CopyOnWriteArrayList {

    //É possível criar uma lista que aloca todo o seu conteúdo em um novo array sempre que é
    //modificada utilizando a classe CopyOnWriteArrayList.

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
         for (String string : list) {
             System.out.println(string);
             if (string.equals("A")) {
                 list.add("D");
             }
         }
        System.out.println("List final: " + list);
    }

    //A
    //B
    //C
    //List final: [A, B, C, D]

    //Perceba que foi possível acrescentar um valor na lista durante a execução do forEach. Em uma
    //lista tradicional haveria ocorrido uma ConcurrentModificationException.
    //Perceba também que, mesmo alterando a lista dentro do forEach, a letra "D" não aparece no
    //console. Isso ocorre pois, quando a letra "D" foi inserida na lista, um novo array foi alocado
    //internamente contendo todos os novos elementos, e a iteração continuou ocorrendo no array
    //antigo.
}
