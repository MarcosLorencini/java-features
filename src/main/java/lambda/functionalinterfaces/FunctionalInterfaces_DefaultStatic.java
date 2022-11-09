package lambda.functionalinterfaces;

public class FunctionalInterfaces_DefaultStatic {

    //Métodos adicionais que sejam default ou static não fazem com que a interface deixe de ser
    //funcional.

    @FunctionalInterface
    interface Executavel { // interface funcional
        void execute(); // método funcional

        // métodos adicionais static são permitidos
        static void execute(Executavel... executavels) {

            for (Executavel executavel : executavels) {
                executavel.execute();
            }
        }

        // métodos adicionais default são permitidos
        default void executeDuasVezes() {
            execute();
            execute();
        }

        //Lembre-se que os métodos static em interfaces podem ser chamados diretamente, como
        //Executavel.execute(…). Dessa forma, não há interferência no fato da interface ser funcional.
        //Por outro lado, os métodos default só podem ser chamados caso você possua uma instância da
        //interface, porém eles já possuem uma implementação padrão.
        //Em caso de dúvidas sobre static ou default em interfaces, volte na seção de "Métodos static e
        //default em Interfaces".
    }
}
