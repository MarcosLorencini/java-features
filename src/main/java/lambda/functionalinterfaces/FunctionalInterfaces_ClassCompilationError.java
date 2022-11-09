package lambda.functionalinterfaces;

public class FunctionalInterfaces_ClassCompilationError {

    //Utilizar a anotaçao @FunctionalInterface em qualquer tipo que não seja uma interface causa um
    //erro de compilação.

    @FunctionalInterface
    interface Executavel { // interface funcional
        void execute(); // método funcional
    }

   // @FunctionalInterface
    class Piloto { // NÃO COMPILA!
        // apenas interfaces podem ser anotadas com @FunctionalInterface
    }
}
