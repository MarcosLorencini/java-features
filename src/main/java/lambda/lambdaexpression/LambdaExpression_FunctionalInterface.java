package lambda.lambdaexpression;

public class LambdaExpression_FunctionalInterface {

    //Expressões lambda são sempre utilizadas para criar instâncias de interfaces funcionais, ou seja,
    //interfaces que possuem apenas um único método abstrato.

    @FunctionalInterface
    interface Executavel { // interface funcional
        String execute(); // método funcional
    }

    private static void executeEApresenteMensagem(Executavel executavel) {
        String mensagem = executavel.execute();
        System.out.println(mensagem);
    }

    public static void main(String[] args) {

        // com classe anônima
        executeEApresenteMensagem(new Executavel() {
            @Override
            public String execute() {
                return "executei com classe anônima";
            }
        });

        // com expressão lambda
        executeEApresenteMensagem(() -> { return "executei com expressão lambda"; });
    }

    //Veja que no exemplo acima o mesmo método executeEApresenteMensagem é invocado duas vezes.
    //Na primeira vez é passada uma nova classe anônima. Na segunda vez é passado uma expressão
    //lambda.
    //Veja também que seria impossível criar uma expressão lambda caso a interface não fosse
    //funcional, ou seja, tivesse mais de um método abstrato. O compilador não saberia identificar
    //que o método execute, da interface Executavel, está sendo implementado dentro da expressão
    //lambda.
}
