package languageenhancements.multipleexception;

public class MultipleException_OverrideVar {

    public static void main(String[] args) {

        //Ao fazer catch de múltiplas Exception, não é permitido sobrescrever a variável da exceção. Mas
        //é possível se for apenas uma Exception no catch.

        try {
            throw new NullPointerException();
        } catch (NullPointerException | IllegalArgumentException e) {
            // NÃO COMPILA - a variável não pode ser sobrescrita quando está em um multi-catch
           // e = new IllegalStateException();
        } catch (Exception e) {
            // COMPILA - ainda é possível sobrescrever a variável quando não é um multi-catch
            e = new IllegalStateException();
        }
    }
}
