package lambda.functionalinterfaces;

public class FunctionalInterfaces_Basic {

    //Interfaces funcionais são um novo tipo de Interface do Java. Nesta seção serão apresentados os
    //conceitos e na seção de Expressões Lambda será possível ver como utilizá-las.
    //1. Interfaces Funcionais são aquelas que possuem apenas um método abstrato, chamado de
    //"método funcional".
    //2. É recomendada a utilização da anotação @FunctionalInterface, mas não obrigatório.

    @FunctionalInterface // a anotação não é obrigatória
    interface Executavel { // interface funcional
        void execute(); // método funcional
    }

    //A anotação @FunctionalInterface garante, em tempo de compilação, que esta interface é
    //funcional. Também indica para outros desenvolvedores que ela foi criada com o intuito de ser
    //utilizada em expressões lambda, e por isso não se deve criar outros métodos abstratos dentro
    //dela.
}
