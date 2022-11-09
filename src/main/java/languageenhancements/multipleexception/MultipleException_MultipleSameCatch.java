package languageenhancements.multipleexception;

public class MultipleException_MultipleSameCatch {

    public static void main(String[] args) {

        try {
            throw new NullPointerException();
        } catch (NullPointerException | IllegalStateException e) { // COMPILA -
            // múltiplas exceções no mesmo catch, só uma variável no final
            System.out.println("Exceção capturada: " + e);
        } /*
        catch (IllegalStateException ise | UnsupportedOperationException uoe) {
            // NÃO COMPILA - mais de uma variável declarada
            System.out.println("Exceção capturada: " + ise);
        } catch (ClassCastException cce | ConcurrentModificationException) {
            { // NÃO COMPILA - só uma variável, mas no lugar errado
            System.out.println("Exceção capturada: " + cce);
        }*/
    }
}
