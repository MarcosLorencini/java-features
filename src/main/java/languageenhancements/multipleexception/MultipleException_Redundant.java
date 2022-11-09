package languageenhancements.multipleexception;

public class MultipleException_Redundant {

    //Não é permitido declarar exceções diferentes, mas que seriam redundantes levando em
    //consideração a herança

    public static void main(String[] args) {
 /*
        try {
            throw new NullPointerException();

        } catch (RuntimeException | IllegalArgumentException e) {
            // NÃO COMPILA - IllegalArgumentException herda de RuntimeException, logo seria redundante
            System.out.println("Exceção capturada + e");
        }
        */
    }
}
