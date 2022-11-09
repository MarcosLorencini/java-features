package localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatter_Locale {

    //É possível alterar o Locale utilizado pelo DateTimeFormatter.

    public static void main(String[] args) {

        LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        shortFormatter = shortFormatter.withLocale(Locale.US);
        mediumFormatter = mediumFormatter.withLocale(Locale.US);

        System.out.println(localDT.format(shortFormatter));
        System.out.println(localDT.format(mediumFormatter));

        //8/6/19 11:40 AM
        //Aug 6, 2019 11:40:00 AM

    }
}
