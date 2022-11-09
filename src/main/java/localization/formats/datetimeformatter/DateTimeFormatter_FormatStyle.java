package localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatter_FormatStyle {

    //. É possível obter instâncias predefinidas de DateTimeFormatter, que representam formatos
    //localizados, através da classe FormatStyle.

    //O resultado depende de onde o código está sendo executado. Este código foi executado no Locale
    //padrão pt_BR.

    public static void main(String[] args) {
        LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);
        DateTimeFormatter dateTimeShortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter dateTimeMeidumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter dateShortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter timeShortFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        System.out.println(localDT.format(dateTimeShortFormatter));
        System.out.println(localDT.format(dateTimeMeidumFormatter));
        System.out.println(localDT.format(dateShortFormatter));
        System.out.println(localDT.format(timeShortFormatter));

        //06/08/19 11:40
        //06/08/2019 11:40:00
        //06/08/19
        //11:40




    }
}
