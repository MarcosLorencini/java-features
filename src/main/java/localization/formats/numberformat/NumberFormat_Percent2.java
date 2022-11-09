package localization.formats.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

//O NumberFormat pode ficar complicado ao lidar com vírgulas.

public class NumberFormat_Percent2 {

    public static void main(String[] args) {
        NumberFormat percentFormatPtBR = NumberFormat.getPercentInstance(new Locale("pt", "BR"));
        NumberFormat percentFormatEnUs = NumberFormat.getPercentInstance(new Locale("en", "US"));

        //String para Percentual
        String s = "80,2%";

        try {
            System.out.println("pt_BR " + percentFormatPtBR.parse(s));
            System.out.println("en_US " + percentFormatEnUs.parse(s));
        } catch (ParseException e) {

        }

        //pt_BR: 0.802
        //en_US: 8.02

        //No Locale pt_BR temos o resultado esperado. Porém, no Locale en_US o 80,2% se torna 802% pois a
        //vírgula não é usada como separador de decimal.
    }




}
