package languageenhancements.multipleexception;

public class MultipleException_RepeatException {

    //Assim como nas versões anteriores, Exceções repetidas ainda são proibidas.

    public static void main(String[] args) {

        try {
            throw new NullPointerException();
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e);
        } /*catch (IllegalStateException | NullPointerException e) {
            // NÃO COMPILA -  NullPointerException já foi capturada no catch anterior
            System.out.println("Exceção capturada: " + e);
        }*/
    }
}
