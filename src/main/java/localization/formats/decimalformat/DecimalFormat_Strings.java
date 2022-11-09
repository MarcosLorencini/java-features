package localization.formats.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormat_Strings {

    //É possível colocar outros símbolos ou palavras no formato do DecimalFormat.

    public static void main(String[] args) {

        double d = 12345.67;

        DecimalFormat decimalFormat = new DecimalFormat("Número ###,###.### formatado");
        System.out.println(decimalFormat.format(d));
    }

    //Número 12.345,67 formatado
}
