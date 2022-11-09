package lambda.functionalinterfaces;

public class FunctionalInterfaces_Extends {

    //Uma interface que estende outra sem acrescentar métodos abstratos também pode ser
    //funcional.

    @FunctionalInterface
    interface Executavel { // interface funcional
        void execute(); // método funcional
    }

    @FunctionalInterface
    interface Aplicacao extends Executavel {
        // também é uma interface funcional
    }
}
