package concurrency.forkjoin;

public class FrameworkForkJoin {

    //Framework Fork/Join

    //Objetivo
    //Usar o Framework Fork/Join de paralelismo

    //Com o framework de Fork/Join é possível dividir uma tarefa grande em pedaços menores e executálos em paralelo. A utilização do framework é simples. A criação de tarefas quebradas em várias
    //partes pode ser um pouco mais complexa.
    //Uma tarefa geralmente segue um comportamento padrão:
    //• Recebe um valor;
    //• Avalia se o valor é pequeno o suficiente para executar a tarefa com ele;
    //◦ Caso positivo, executa a tarefa com aquele valor;
    //◦ Caso negativo, quebra em uma ou mais partes e cria novas tarefas menores;
    //• Segue executando de forma recursiva.
    //Serão apresentados exemplos utilizando a classe RecursiveAction, que não retorna valores, e por
    //isso sua implementação é mais simples. E utilizando a classe RecursiveTask, que retorna valores e
    //por isso sua implementação é um pouco mais complexa.
    //Os exemplos são grandes, pois é necessário implementar toda a classe RecursiveAction ou
    //RecursiveTask para o exemplo funcionar. Por isso, os passos serão descritos com comentários no
    //código, explicando o funcionamento de cada chamada realizada ao framework.
}
