package languageenhancements.trywithresources;

public class TryWithResouces_WithCatchFinally {

    //A instrução try-with-resources ainda pode ter catch e finally, apesar de não ser necessário.
    //Nesse caso, os recursos são fechados depois do try e antes de qualquer catch ou finally.
    //O método close pode lançar uma exceção sendo capturada pelo catch, caso exista.

    static class Porta implements AutoCloseable {

        @Override
        public void close() throws Exception { // chamado automaticamente pelo try-withresources
            System.out.println("Porta fechada.");
            throw new Exception(); //lança Exception
        }
    }

    public static void main(String[] args) {
        try (Porta porta = new Porta()) {
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
