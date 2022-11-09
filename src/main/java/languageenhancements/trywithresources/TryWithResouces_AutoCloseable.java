package languageenhancements.trywithresources;

public class TryWithResouces_AutoCloseable  {

    static class Porta implements AutoCloseable {

        @Override
        public void close() throws Exception { // chamado automaticamente pelo try-with-resources
            System.out.println("Porta fechada.");
        }
    }



    public static void main(String[] args) throws Exception {
        try(Porta porta = new Porta()) {  // Porta instanciada dentro da instrução trywith-resources
            System.out.println("try");
        }
    }
}
