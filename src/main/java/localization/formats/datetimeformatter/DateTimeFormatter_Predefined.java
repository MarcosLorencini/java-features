package localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Predefined {

    //O Java 8 traz a classe DateTimeFormatter que possui várias formas de formatar e transformar
    //Data/Hora em String, e vice-versa.

    //É possível obter instâncias predefinidas de DateTimeFormatter, que representam formatos ISO ou
    //RFC.

    public static void main(String[] args) {
        LocalDateTime localTD = LocalDateTime.of(2019, 8, 6, 11, 40);
        System.out.println(localTD.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localTD.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(localTD.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(localTD.format(DateTimeFormatter.ISO_ORDINAL_DATE));
        System.out.println(localTD.format(DateTimeFormatter.ISO_WEEK_DATE));
    }

    //2019-08-06
    //11:40:00
    //2019-08-06T11:40:00
    //2019-218
    //2019-W32-2

}
