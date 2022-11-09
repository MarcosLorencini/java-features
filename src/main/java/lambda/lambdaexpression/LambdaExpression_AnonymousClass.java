package lambda.lambdaexpression;

import org.w3c.dom.ls.LSOutput;

public class LambdaExpression_AnonymousClass {

    public static void main(String[] args) {

        // com classe anônima
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando");
            }
        }).run();

        // com expressão lambda
        new Thread(() -> System.out.println("Executando")).run();

    }

    //Veja que no exemplo acima é instanciada uma Thread com uma instância anônima de Runnable.
    //Na segunda parte, é feito a mesma coisa de forma muito mais simples utilizando uma expressão
    //lambda


}
