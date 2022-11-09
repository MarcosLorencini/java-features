package localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_NotExactLocale {

    //Ao buscar por um resource bundle, o Java tenta encontrar um arquivo com o Locale exato. Se
    //não encontrar, busca na seguinte ordem:

    //a. Um arquivo do mesmo idioma, mas sem o país;
    //b. Um arquivo do Locale padrão;
    //c. Um arquivo do Locale padrão, mas sem o país;
    //d. Um arquivo sem Locale, que é o resource bundle padrão;
    //e. Lança MissingResourceException caso não encontre.

    //Por exemplo, ao executar a aplicação com o Locale padrão en_US, e solicitar um Locale pt_BR,
    //a ordem de busca do resource bundle seria a seguinte:
    //i. Text_pt_BR → Locale exato
    //ii. Text_pt → Locale solicitado, sem o país
    //iii. Text_en_US → Locale padrão
    //iv. Text_en → Locale padrão, sem o país
    //v. Text → Resource Bundle padrão

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR")); // pt_BR como Locale padrão
        ResourceBundle bundle2 = ResourceBundle.getBundle("Text", new Locale("zh", "CN"));
        System.out.println(bundle2.getLocale()); // Bundle localizado para o Locale "zh_CH" (Chinês simplificado)

        ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("it", "CH"));
        System.out.println(bundle.getLocale()); // Bundle localizado para o Locale "it_CH" (Italiano da Suíça)

        //Veja que o Locale padrão é pt_BR. Por isso ele foi utilizado ao solicitar um resource bundle
        //para zh_CN, pois não existe um bundle para esse Locale.
        //Por outro lado, ao solicitar um resource bundle para o Locale it_CH, ele encontrou o mais
        //próximo, que seria o Locale it, mas sem um país específico.

    }
}
