package localization.formats.dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat_Instance {
    //Para formatar Data e Hora antes do Java 8, são utilizadas as classes de DateFormat e
    //SimpleDateFormat. Essas classes trabalham em geral com a classe Date e fazem parte do pacote
    //java.text, diferente de DateTimeFormatter que é do novo pacote java.time.format.
    //1. Obter instâncias de DateFormat é muito parecido com NumberFormat.
    //2. É possível definir o formato das instâncias como SHORT, MEDIUM, LONG ou FULL.
    //3. É possível definir o Locale das instâncias.

    public static void main(String[] args) {
        DateFormat dateInstance = DateFormat.getDateInstance();
        DateFormat timeInstance = DateFormat.getTimeInstance();
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        DateFormat dateTimeLongInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        DateFormat dateTimeUSInstance = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.US);

        Date date = new Date(1000000000000L); // data em quantidade de milissegundos desde 01/01/1970

        System.out.println(dateInstance.format(date));
        System.out.println(timeInstance.format(date));
        System.out.println(dateTimeInstance.format(date));
        System.out.println(dateTimeLongInstance.format(date));
        System.out.println(dateTimeUSInstance.format(date));

        //08/09/2001
        //22:46:40
        //08/09/2001 22:46:40
        //8 de Setembro de 2001 22h46min40s BRT
        //September 8, 2001 10:46:40 PM BRT

    }
}
