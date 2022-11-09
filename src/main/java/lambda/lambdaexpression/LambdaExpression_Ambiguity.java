package lambda.lambdaexpression;

public class LambdaExpression_Ambiguity {

    //Se não for possível descobrir o tipo da expressão lambda, ocorre erro de compilação.

    @FunctionalInterface
    interface Corredor {
        void corra();
    }

    @FunctionalInterface
    interface Piloto {
        void corra();
    }

    static class Executor {
        void execute(Corredor corredor) {
            corredor.corra();
        }

        String execute(Piloto piloto) {
            piloto.corra();
            return "correndo";
        }
    }

    public static void main(String[] args) {
        Executor executor = new Executor();
        // NÃO COMPILA - não é possível determinar o tipo da expressão lambda abaixo
        // executor.execute(() -> System.out.println("execute"));
    }

    //No exemplo anterior, como as duas interfaces funcionais possuem métodos com retorno void, o
    //compilador não sabe qual das duas está sendo instanciada na expressão lambda, e ocorre erro
    //de compilação. A expressão lambda, nesse exemplo, poderia ser tanto do tipo Piloto quanto
    //Corredor, e não há como o compilador descobrir qual o desenvolvedor de fato quis utilizar.
}
