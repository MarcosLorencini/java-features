package localization.locale;

import java.util.Locale;

public class Locale_LocaleDefault {

    //É possível recuperar o Locale padrão ou alterá-lo programaticamente.

    public static void main(String[] args) {
        // o padrão inicial muda de acordo com seu dispositivo
        System.out.println(Locale.getDefault());

        Locale.setDefault(Locale.KOREA); // altera o Locale default
        System.out.println(Locale.getDefault()); // ko_KR

    }
}
