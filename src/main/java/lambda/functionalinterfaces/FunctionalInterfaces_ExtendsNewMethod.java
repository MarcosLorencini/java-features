package lambda.functionalinterfaces;

public class FunctionalInterfaces_ExtendsNewMethod {

    //Se uma interface estende outra que é funcional, porém acrescenta novos métodos abstratos, ela
    //não é funcional.

    @FunctionalInterface
    interface Executavel { // interface funcional
        void execute(); // método funcional
    }

    interface Aplicacao extends Executavel {
        // NÃO é uma interface funcional, pois possui 2 métodos abstratos: execute (herdado) e inicie.
        void inicie();
    }
}
