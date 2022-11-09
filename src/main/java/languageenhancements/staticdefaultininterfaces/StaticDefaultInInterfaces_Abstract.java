package languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_Abstract {

    //Diferente dos outros método de uma interface, os métodos static e default não são abstract, e
    //também não podem ser. Afinal, eles possuem implementação. Apenas métodos sem
    //implementação são abstract.

    interface Corredor {

        default String correr() { // COMPILA - método default não é abstract
            return "Correndo";
        }

        /*abstract default String correrRapido() { // NÃO COMPILA - método default não pode ser declarado abstract
            return "Correr Rápido";
        }*/

        String correrDevagar(); // COMPILA - método comum, é abstract por padrão, mesmo que de forma implícita

        /*abstract String double calculeVelocidade(int d, int t) { // NÃO COMPILA - método static não pode ser declarado abstract
            retur d / t;
        }*/



    }
}
