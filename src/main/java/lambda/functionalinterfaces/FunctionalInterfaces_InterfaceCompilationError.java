package lambda.functionalinterfaces;

public class FunctionalInterfaces_InterfaceCompilationError {

    //Utilizar a anotação @FunctionalInterface em interfaces que possuem mais de um método
    //abstrato causa um erro de compilação.

    @FunctionalInterface
    interface Executavel { // interface funcional
        void execute(); // método funcional
    }

    //@FunctionalInterface
    interface Aplicacao extends Executavel { // NÃO COMPILA!
        // não pode ser anotada como funcional, pois possui 2 métodos abstratos
        void inicie();
    }
}
