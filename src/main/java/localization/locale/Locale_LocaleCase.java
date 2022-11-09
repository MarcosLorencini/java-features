package localization.locale;

import java.util.Locale;

public class Locale_LocaleCase {

    //O Locale aceita letras maiúsculas e minúsculas escritas de forma incorreta.

    //Nesse exemplo, escrevemos de forma incorreta:
    //◦ O idioma deveria ser minúsculo (pt), mas está maiúsculo (PT).
    //◦ A região deveria estar maiúscula (BR), está minúscula (br).
    //Mesmo assim, o Locale é criado corretamente. Veja que isso é um código ruim. O ideal é
    //sempre escrever respeitando maiúsculas e minúsculas.

    public static void main(String[] args) {

        System.out.println(new Locale("PT", "br"));

        System.out.println(Locale.forLanguageTag("PT-br"));

        Locale localePtBR = new Locale.Builder()
                .setLanguage("PT")
                .setRegion("br")
                .build();
        System.out.println(localePtBR);

    }
}
