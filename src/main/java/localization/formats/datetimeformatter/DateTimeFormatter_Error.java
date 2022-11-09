package localization.formats.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Error {

    //Não é possível formatar uma Data/Hora caso o objeto fornecido não tenha os campos
    //necessários. Um exemplo seria tentar apresentar a Data e fornecer um LocalTime.

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, 8, 6);
        LocalTime localTime = LocalTime.of(11, 40);
        LocalDateTime localDT = LocalDateTime.of(localDate, localTime);
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDT.format(DateTimeFormatter.ISO_LOCAL_DATE));
        // lança exceção pois não possui campos de data
        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_DATE));

        //2019-08-06
        //2019-08-06
        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException:
        //Unsupported field: Year
        //  at java.time.LocalTime.get0(LocalTime.java:679)
        //  at java.time.LocalTime.getLong(LocalTime.java:656)
        //  at java.time.format.DateTimePrintContext$1.getLong
        //(DateTimePrintContext.java:205)
        //  at
        //java.time.format.DateTimePrintContext.getValue(DateTimePrintContext.java:298)
        //  at java.time.format.DateTimeFormatterBuilder$NumberPrinterParser.format
        //(DateTimeFormatterBuilder.java:2551)
        //  at java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format
        //(DateTimeFormatterBuilder.java:2190)
        //  at java.time.format.DateTimeFormatter.formatTo(DateTimeFormatter.java:1746)
        //  at java.time.format.DateTimeFormatter.format(DateTimeFormatter.java:1720)
        //  at java.time.LocalTime.format(LocalTime.java:1413)
        //  at
        //org.j6toj8.localization.formats.datetimeformatter.DateTimeFormatter_Error.main(Date
        //TimeFormatter_Error.java:18)
    }
}
