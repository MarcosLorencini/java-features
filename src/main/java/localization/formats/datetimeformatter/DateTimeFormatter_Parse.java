package localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatter_Parse {

    //Também é possível fazer o oposto: converter uma String em uma classe de Data/Hora. Para isso
    //existem os métodos parse.

    public static void main(String[] args) {

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd MM yy - HH mm ss");
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        LocalDateTime parseCustom = LocalDateTime.parse("06 08 19 - 11 40 00", customFormatter);
        LocalDateTime parseIso = LocalDateTime.parse("2019-08-06T11:40:00", isoFormatter);
        LocalDateTime parseShort = LocalDateTime.parse("06/08/19 11:40", shortFormatter);

        System.out.println(parseCustom);
        System.out.println(parseIso);
        System.out.println(parseShort);

        //2019-08-06T11:40
        //2019-08-06T11:40
        //2019-08-06T11:40



    }
}
