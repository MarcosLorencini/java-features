package languageenhancements.trywithresources;

public class TryWithResouces_Suppressed {
    // exceção que de fato foi capturada foi a do bloco try, pois foi lançada primeiro. A
    //exceção lançada pelo método close ficou suprimida, e fica disponível em um array no método
    //getSuppressed() da exceção

    static class Porta implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("close");
            throw new RuntimeException("Erro no close"); // lança RuntimeException, mas só depois do try
        }

        public static void main(String[] args) {
            try (Porta porta = new Porta()) {
                System.out.println("try");
                throw new RuntimeException("erro no try"); // lança RuntimeException
            } catch (Exception e) { // captura RuntimeException - qual foi capturada?
                System.out.println(e.getMessage()); // apresenta a mensagem da exceção do try
                System.out.println(e.getSuppressed()[0].getMessage()); // apresenta a mensagem da exceção suprimida, ou seja, do close
            }
        }
    }
}
