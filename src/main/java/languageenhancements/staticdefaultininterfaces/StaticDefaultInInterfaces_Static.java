package languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_Static {

    interface Corredor {
        static double calculeVelocidade(int distancia, int tempo) {
            return distancia / tempo;
        }
    }

    static class Pessoa implements Corredor {
        public static void main(String[] args) {
            // COMPILA - método static de uma interface sendo chamado como se fosse de uma classe comum
            System.out.println(Corredor.calculeVelocidade(100, 50));

            // NÃO COMPILA - o método static não é herdado, nem implementado, pela classe Pessoa
            //System.out.println(Pessoa.calculaVelocidade(100, 50));
        }
    }
}
