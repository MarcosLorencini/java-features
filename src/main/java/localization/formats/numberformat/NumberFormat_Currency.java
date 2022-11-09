package localization.formats.numberformat;

//O NumberFormat pode ser utilizado para transformar Strings em valores monetários, e vice-versa.

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_Currency {

    public static void main(String[] args) {

        NumberFormat currencyFormatPtBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormat currencyFormatEnUS = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        NumberFormat currencyFormatFrFR = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));

        // Valor monetário para String
        double d = 1000.05;

        System.out.println("pt_BR: " + currencyFormatPtBR.format(d));
        System.out.println("en_US: " + currencyFormatEnUS.format(d));
        System.out.println("fr_FR: " + currencyFormatFrFR.format(d));

        // String para valor Monetário
        String s = "R$ 1000,05";

        try {
            System.out.println("pt_BR: " + currencyFormatPtBR.parse(s));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("en_US: " + currencyFormatEnUS.parse(s));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("fr_FR: " + currencyFormatFrFR.parse(s));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        //Perceba que novamente o resultado muda de acordo com o Locale. Além disso, não é possível
        //converter a representação da moeda brasileira com um Locale en_US ou fr_FR.
    }
}
