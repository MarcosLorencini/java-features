package languageenhancements.multipleexception;

public class MultipleException_CheckedException {

    //Assim como nas versões anterior, Exceções checadas (aquelas que herdam de Exception) só
    //podem estar em um catch caso algo no try lance elas.

    public static void main(String[] args) {

       /* try {
            throw new NullPointerException();
        } catch (NullPointerException | IOException e) {
            // NÃO COMPILA - IOException não é lançada dentro do bloco try
            System.out.println("Exceção capturada: " + e);
        }*/
    }
}
