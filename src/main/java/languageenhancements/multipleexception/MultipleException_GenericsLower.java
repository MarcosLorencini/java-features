package languageenhancements.multipleexception;

public class MultipleException_GenericsLower {

    //Assim como nas versões anteriores, tipos mais genéricos de Exception devem vir depois, mais
    //abaixo nos catch’s.

    public static void main(String[] args) {

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e);
        } /*catch (NullPointerException | IllegalArgumentException e) {
            // NÃO COMPILA - NullPointerException é mais específico que Exception, logo deveria ser capturada
            //antes de Exception
            System.out.println("Exceção capturada: " + e);
        }*/
    }
}
