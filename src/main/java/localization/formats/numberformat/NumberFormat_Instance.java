package localization.formats.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_Instance {
    //O exame de certificação compreende cinco classes principais de formatação:
    //• NumberFormat → Formatação geral de números, valores monetários, percentuais e números
    //inteiros com arredondamento, possivelmente baseados em Locale.
    //• DecimalFormat → Formatação de números quando há necessidade de definições mais específicas
    //ou personalizadas do formato.
    //• DateFormat → Formatação de data e hora antes do Java 8 utilizando formatos predefinidos.
    //• SimpleDateFormat → Formatação de data e hora antes do Java 8 utilizando formatos mais
    //específicos ou personalizados.
    //• DateTimeFormatter → Formatação de data e hora após o Java 8.

    public static void main(String[] args) {
        //É possível obter uma instância de NumberFormat a partir de vários métodos estáticos, dependendo
        //da necessidade.

        // sem Locale
        NumberFormat instance1 = NumberFormat.getInstance();
        NumberFormat instance2 = NumberFormat.getNumberInstance();
        NumberFormat instance3 = NumberFormat.getCurrencyInstance();
        NumberFormat instance4 = NumberFormat.getPercentInstance();

        // com Locale
        NumberFormat instance5 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormat instance6 = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        NumberFormat instance7 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        NumberFormat instance8 = NumberFormat.getPercentInstance(new Locale("pt", "BR"));

        //Lembre-se que, se não for informado o Locale, será utilizado o padrão. O ideal é sempre
        //informar o Locale.

    }
}
