package languageenhancements.trywithresources;

public class TryWithResouces_Order {

    // como a ordem de declaração dentro do try-with-resources foi Porta e depois Gaveta, a
    //ordem de chamada do método close é inversa: Gaveta e depois Porta.

    static class Porta implements AutoCloseable {

        @Override
        public void close(){ // chamado automaticamente pelo try-with-resources
            System.out.println("Porta fechada.");
        }
    }

    static class Gaveta implements AutoCloseable {

        @Override
        public void close() { // chamado automaticamente pelo try-with-resources
            System.out.println("Gaveta fechada.");
        }
    }

    public static void main(String[] args) {
        try (Porta porta = new Porta();  Gaveta gaveta = new Gaveta()) {
            System.out.println("Olá.");
        }
    }
}
