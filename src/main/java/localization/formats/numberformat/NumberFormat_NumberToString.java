package localization.formats.numberformat;

//O NumberFormat pode ser utilizado para transformar números em Strings.

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_NumberToString {

    //O NumberFormat pode ser utilizado para transformar números em Strings.

    public static void main(String[] args) {
        NumberFormat numberFormatPtBR = NumberFormat.getInstance(new Locale("pt", "BR"));
        NumberFormat numberFormatEnUS = NumberFormat.getInstance(new Locale("en","US"));
        NumberFormat numberFormatFrFR = NumberFormat.getInstance(new Locale("fr", "FR"));

        double d = 1000.05;

        System.out.println("pt_BR: " + numberFormatPtBR.format(d));
        System.out.println("en_US: " + numberFormatEnUS.format(d));
        System.out.println("fr_FR: " + numberFormatFrFR.format(d));

        //Perceba que a representação do número muda de acordo com o Locale.
    }

}
