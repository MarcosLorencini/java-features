package lambda.functionalinterfaces;

public class FunctionalInterfaces_OverrideObject {

    //Sobrescrever na interface um método público de java.lang.Object também não faz com que ela
    //deixe de ser funcional.

    @FunctionalInterface
    interface Executavel { // interface funcional
        void execute(); // método funcional

        // sobrescrevendo métodos de Object
        @Override
        String toString();
        @Override
        boolean equals(Object obj);
        @Override
        int hashCode();
    }
}
