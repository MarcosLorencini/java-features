package lambda.functionalinterfaces;

public class FunctionalInterfaces_Implement {

    //Interfaces funcionais são feitas com o intuito de serem utilizadas em expressões lambda, mas o
    //código também irá compilar normalmente caso uma classe a implemente.

    @FunctionalInterface
    interface Executavel {  // interface funcional
        String execute(); // método funcional
    }

}
class Pessoa implements FunctionalInterfaces_Implement.Executavel {
    // COMPILA!
    // interfaces funcionais, como Executavel, não foram feitas para serem implementadas dessa forma
    // porém é possível e o código compila normalmente

    @Override
    public String execute() {
        return "Executando";
    }

    //Esse é apenas um exemplo para você saber que essa implementação não gera erro de
    //compilação, mas não utilize interfaces funcionais dessa forma. Na seção de Expressões Lambda
    //você verá como as interfaces funcionais devem ser utilizadas na prática.
}
