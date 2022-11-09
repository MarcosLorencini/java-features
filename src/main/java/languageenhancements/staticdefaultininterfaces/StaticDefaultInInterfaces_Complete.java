package languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_Complete {

    //Desde o Java 8, Interfaces podem ter métodos com o modificador static

    //Métodos com o modificador static em interfaces são chamados iguais aos de uma classe
    //comum, ou seja, não fazem parte da API da interface. Dessa forma, não são herdados pelas
    //classes que implementam essa interface.

    interface Corredor {
        static double calculaVelocidade(int distancia, int tempo) {
            return distancia / tempo;
        }

        default String correr() {
            return "Correndo";
        }

        String correrRapido();
    }

    static class Pessoa implements Corredor {
        @Override
        public String correrRapido() {
            return "Pessoa Correndo Rápido";
        }
    }

    public static void main(String[] args) {
        System.out.println(Corredor.calculaVelocidade(100,10));
        System.out.println(new Pessoa().correr());
        System.out.println(new Pessoa().correrRapido());
    }

}
