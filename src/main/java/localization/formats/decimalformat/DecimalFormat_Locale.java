package localization.formats.decimalformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormat_Locale {

    //Para utilizar um Locale específico é necessário instanciar um NumberFormat e fazer um cast para
    //DecimalFormat.

    public static void main(String[] args) {
        double d = 12345.67;
        NumberFormat numberFormatUS = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decimalFormatUS = (DecimalFormat) numberFormatUS;
        decimalFormatUS.applyLocalizedPattern("###,###.###");
        System.out.println(decimalFormatUS.format(d));
    }

    //12,345.67
}
