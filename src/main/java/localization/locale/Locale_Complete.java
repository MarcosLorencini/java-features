package localization.locale;

import java.util.Locale;

public class Locale_Complete {

    //A diferença entre eles é:
    //◦ Com os construtores é possível passar apenas o idioma, a região (país) e uma variante.
    //◦ Com language tags é possível passar uma String no padrão IETF BCP 47.
    //◦ Com o builder é possível criar da forma mais específica possível: idioma, região, variante,
    //script e extensões.

    public static void main(String[] args) {
        System.out.println(" - Constantes -");
        System.out.println(Locale.CANADA);
        System.out.println(Locale.UK);

        System.out.println(" - Construtor -");
        System.out.println(new Locale("pt", "BR")); // pt-BR com Construtor
        System.out.println(new Locale("pt", "PT"));
        System.out.println(new Locale("en", "US"));
        System.out.println(new Locale("ca", "ES", "VALENCIA"));


        System.out.println(" - Language Tags - ");
        System.out.println(Locale.forLanguageTag("en-CA"));
        System.out.println(Locale.forLanguageTag("pt-BR")); // pt-BR com LanguageTag
        System.out.println(Locale.forLanguageTag("pt-PT"));
        System.out.println(Locale.forLanguageTag("ca-ES"));
        System.out.println(Locale.forLanguageTag("gsw-u-sd-chzh"));

        System.out.println(" - Builder -");
        Locale locale1 = new Locale.Builder() // pt-BR com Builder
                .setLanguage("pt")
                .setRegion("BR")
                .build();
        System.out.println(locale1);

        Locale locale2 = new Locale.Builder()
                .setLanguage("az")
                .setRegion("AZ")
                .build();
        System.out.println(locale2);

        Locale locale3 = new Locale.Builder()
                .setLanguage("bs")
                .setRegion("BA")
                .setVariant("POSIX")
                .setScript("Latn")
                .setExtension('c', "cc")
                .build();
        System.out.println(locale3);

    }
}
