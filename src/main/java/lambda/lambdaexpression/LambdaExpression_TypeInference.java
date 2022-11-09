package lambda.lambdaexpression;

public class LambdaExpression_TypeInference {

    //Em situações de ambiguidade, o compilador tenta descobrir o tipo da expressão lambda
    //utilizando o contexto.

    @FunctionalInterface
    interface Executavel {
        void execute(); // método funcional sem argumentos
    }

    @FunctionalInterface
    interface Application {
        String run(); // método funcional também sem argumentos
    }

    static class Executor {
        // esse método pode receber uma expressão lambda sem argumentos
        void rode(Executavel executavel) {
            executavel.execute();
        }
        // esse método também pode receber uma expressão lambda sem argumentos
        void rode(Application application) {
            application.run();
        }
    }

    public static void main(String[] args) {
        Executor executor = new Executor();
        executor.rode(() -> {return "executando";}); // irá chamar o execute que recebe uma Application
        executor.rode(() -> {
            System.out.println("exetutando"); // irá chamar o execute que recebe um Executavel
        });
    }

    //No exemplo anterior, apenas o método run da interface funcional Application retorna uma
    //String, enquanto o método execute da interface funcional Executavel não retorna nada (void).
    //Isso é diferença suficiente para o compilador saber qual método chamar cada vez que rode é
    //invocado.
    //Na primeira chamada ao método rode, como a expressão lambda passada retorna uma String, o
    //compilador entende que essa expressão lambda é uma implementação da interface Application,
    //pois o método run também retorna uma String.
    //Na segunda chamada ao método rode, como a expressão lambda não retorna nada (apenas
    //imprime a String "executando"), o compilador entende que essa expressão lambda é uma
    //implementação da interface Executavel, pois o método execute também não retorna nada.
}
