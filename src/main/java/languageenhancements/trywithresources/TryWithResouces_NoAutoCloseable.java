package languageenhancements.trywithresources;

public class TryWithResouces_NoAutoCloseable {
    //Somente classes que implementam AutoCloseable podem ser utilizadas dentro do try-withresources
    static class Prateleira {}

    public static void main(String[] args) {
       /* try (Prateleira prateleira = new Prateleira()) {  // NÃO COMPILA - Prateleira não implementa AutoClosable

            System.out.println("Olá");
        }*/
    }
}
