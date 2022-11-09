package localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundle_Complete {

    //Ao codificar uma aplicação com internacionalização é comum o uso de resource bundles, ou
    //"conjunto de recursos" em português. São arquivos, geralmente .properties ou classes Java, que
    //armazenam Strings. Cada arquivo contém Strings em idiomas, ou Locales, diferentes.

    //1. O nome do Locale é o sufixo do nome do arquivo, e o resource bundle padrão não tem sufixo.
    //Exemplos:
    //◦ Text.properties → Locale padrão
    //◦ Text_pt_BR.properties → Locale pt_BR
    //◦ Text_pt.properties → Locale pt
    //◦ Text_es_ES.properties → Locale es_ES
    //◦ Text_es.properties → Locale es
    //2. O arquivo .properties pode ser expresso com 3 separadores diferentes: = (igual), : (dois pontos)
    //ou um espaço em branco

    //O mais comum é utilizar o = para separar as propriedades, mas as 3 funcionam da mesma
    //forma.

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        System.out.println("\n -- Locale padrão (en_US) -- ");
        ResourceBundle bundleDefault = ResourceBundle.getBundle("Text");
        Set<String> keySetDefault = bundleDefault.keySet();
        for (String string : keySetDefault) {
            System.out.println(string + " - " + bundleDefault.getString(string));
        }

        System.out.println("\n -- Locale es_ES -- ");
        ResourceBundle bundleEsEs = ResourceBundle.getBundle("Text", new Locale("es", "ES"));
        Set<String> keySetEsEs = bundleEsEs.keySet();
        for (String string : keySetEsEs) {
            System.out.println(string + " - " + bundleEsEs.getString(string));
        }

        System.out.println("\n -- Locale pt_BR -- ");
        ResourceBundle bundlePtBr = ResourceBundle.getBundle("Text", new Locale("pt", "BR"));
        Set<String> keySetPtBr = bundlePtBr.keySet();
        for(String string : keySetPtBr) {
            System.out.println(string + " - " + bundlePtBr.getString(string));
        }

    }
}
