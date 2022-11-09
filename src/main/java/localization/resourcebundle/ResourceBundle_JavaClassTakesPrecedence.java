package localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

//A nomenclatura do arquivo é a mesma para classes Java e arquivos .properties, mudando
//apenas a extensão.
//Veja que os arquivos .properties se chamam Text_xx_XX.properties, e os arquivos .java se
//chamam Text_xx_XX.java. Programaticamente, ambos são utilizados da mesma forma.
//Se houver um arquivo .properties e uma classe Java para o mesmo Locale, a classe Java é
//utilizada.

/*
 * Recupera o Bundle do arquivo "Text_fr_CA.java",
 * pois tem precedência sobre o arquivo "Text_fr_CA.properties"
 */



public class ResourceBundle_JavaClassTakesPrecedence {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("fr", "CA"));
        System.out.println(bundle.getString("pen"));
        System.out.println(bundle.getString("glass"));
        System.out.println(bundle.getString("keyboard"));
    }
}
