package languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_AccessModifiers {

    //Assim como os outros método de uma interface, os métodos static e default são sempre public,
    //e não podem ser modificados para private ou protected

    interface Corredor {

        default String correr() { // COMPILA - não há modificador de acesso declarado, é automaticamente público
            return "Correndo";
        }

        public default String correrRapido() { // COMPILA - modificador de acesso público explícito
            return "Correr Rápido";
        }

        /*protected default String correrDevagar() { // NÃO COMPILA - o método deve ser obrigatoriamente público
            return "Correr Devagar";
        }*/

       /* private default String correrExtremo() {  // NÃO COMPILA - o método deve ser obrigatoriamente público
            return "Correr ao Extremo";
        }*/

        /*private static double calculeVelocidade(int d, int t) { // NÃO COMPILA - o método deve ser obrigatoriamente público
            return d / t;
        }*/




    }



}
