package localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Inheritance {
    //Os arquivos mais específicos herdam as chaves e valores de arquivos mais genéricos, caso eles
    //não as tenham.
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US")); // pt_BR como Locale padrão
        ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("pt", "BR"));
        System.out.println("Locale: " + bundle.getLocale());  // Bundle localizado para o Locale "pt_BR" (Português do Brasil)

        System.out.println(bundle.getObject("pen"));
        System.out.println(bundle.getObject("paper"));
        System.out.println(bundle.getObject("keyboard"));

        //Veja que nesse exemplo foi localizado um resource bundle com o Locale exato pt_BR. Porém, nem
        //todas as chaves foram encontradas nesse arquivo:
        //◦ caneta foi localizado no arquivo Text_pt_BR.properties
        //◦ papel foi localizado no arquivo Text_pt.properties
        //◦ keyboard foi localizado no arquivo Text.properties

    }
}
