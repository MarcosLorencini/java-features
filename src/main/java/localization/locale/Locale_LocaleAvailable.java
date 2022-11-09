package localization.locale;

import java.util.Locale;

public class Locale_LocaleAvailable {

    //É possível verificar os Locale disponíveis, pois eles variam de acordo com a JVM sendo
    //executada.

    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();

        for (int i = 0; i<10; i++) {
            System.out.println(availableLocales[i]);
        }
    }
}
