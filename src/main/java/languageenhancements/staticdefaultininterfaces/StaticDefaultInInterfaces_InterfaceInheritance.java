package languageenhancements.staticdefaultininterfaces;

public class StaticDefaultInInterfaces_InterfaceInheritance {

    //Quando uma interface herda de outra interface métodos default, estes podem ser mantidos,
    //transformados em abstract ou redefinidos.

    //Nesse exemplo, a interface Piloto herda de Corredor e mostra 3 cenários distintos:
    //◦ Mantém o método correr() inalterado;
    //◦ Altera o método correrRapido() para que seja abstract, fazendo com que qualquer classe
    //que implemente a interface Piloto tenha que implementar esse método;
    //◦ Altera o método correrDevagar() para que tenha sua própria implementação

    interface Corredor {

        default String correr() {
            return "Correndo";
        }

        default String correrRapido() {
            return "Correndo Rápído";
        }

        default String correrDevagar() {
            return "Correr Devagar";
        }
    }

    interface Piloto extends Corredor {

        String correrRapido();

        default String correrDevagar() {
            return "Piloto Correndo Devagar";
        }
    }


}
