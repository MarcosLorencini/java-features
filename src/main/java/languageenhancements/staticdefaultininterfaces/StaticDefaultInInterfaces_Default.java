package languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_Default {

    //Desde o Java 8, Interfaces podem ter métodos com o modificador default.
    //Métodos default não precisam, mas podem, ser sobrescritos.

    //Veja que a classe Pessoa não sobrescreve o método correr(), mantendo o comportamento
    //padrão da implementação feita na interface Corredor.
    //A classe Cavalo, por outro lado, sobrescreve o método correr() para ter sua própria
    //implementação.


    interface Corredor {
        default String correr() {
            return "Corredor";
        }
    }

    static class Pessoa implements Corredor {

    }

    static class Cavalo implements Corredor {
        @Override
        public String correr () {
            return "Galopando";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Pessoa().correr());
        System.out.println(new Cavalo().correr());
    }
}
