package localization.formats.numberformat;

//O NumberFormat pode ser utilizado para transformar Strings em percentuais, e vice-versa.

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_Percent {

    public static void main(String[] args) {
        NumberFormat percentFormatPtBR = NumberFormat.getPercentInstance(new Locale("pt", "BR"));
        NumberFormat percentFormatEnUs = NumberFormat.getPercentInstance(new Locale("en", "US"));
        NumberFormat percentFormatFrFR = NumberFormat.getPercentInstance(new Locale("fr", "FR"));

        //Percentual para String
        double d = 0.9;

        System.out.println("pt_BR " + percentFormatPtBR.format(d));
        System.out.println("en_Us " + percentFormatEnUs.format(d));
        System.out.println("fr_FR " + percentFormatFrFR.format(d));

        //String para Percentual
        String s = "80%";

        try {
            System.out.println("pt_BR " + percentFormatPtBR.parse(s));
            System.out.println("en_US " + percentFormatEnUs.parse(s));
            System.out.println("fr+FR " + percentFormatFrFR.parse(s));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        //pt_BR: 90%
        //en_US: 90%
        //fr_FR: 90 %
        //pt_BR: 0.8
        //en_US: 0.8
        //Unparseable number: "80%"

        //Veja que, ao formatar, 100% é 1, logo 80% é 0,8. Além disso, no Locale fr_FR a representação 80%
        //não é válida

    }
}
