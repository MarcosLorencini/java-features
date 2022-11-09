package localization.formats.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_ErrorCustom {

    //O mesmo erro pode ocorrer ao utilizar um formato personalizado.

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019,8,6);
        LocalTime localTime = LocalTime.of(11,40);
        LocalDateTime localDT = LocalDateTime.of(localDate, localTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm ss");

        System.out.println(localDT.format(formatter));
        System.out.println(localTime.format(formatter));
        System.out.println(localDate.format(formatter));; // lança exceção pois não possui campos de

        //11 40 00
        //11 40 00
        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException:
        //Unsupported field: HourOfDay
        //  at java.time.LocalDate.get0(LocalDate.java:680)
        //  at java.time.LocalDate.getLong(LocalDate.java:659)
        //  at
        //java.time.format.DateTimePrintContext.getValue(DateTimePrintContext.java:298)
        //  at java.time.format.DateTimeFormatterBuilder$NumberPrinterParser.format
        //(DateTimeFormatterBuilder.java:2551)
        //  at java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format
        //(DateTimeFormatterBuilder.java:2190)
        //  at java.time.format.DateTimeFormatter.formatTo(DateTimeFormatter.java:1746)
        //  at java.time.format.DateTimeFormatter.format(DateTimeFormatter.java:1720)
        //  at java.time.LocalDate.format(LocalDate.java:1691)
        //  at
        //org.j6toj8.localization.formats.datetimeformatter.DateTimeFormatter_ErrorCustom.mai
        //n(DateTimeFormatter_ErrorCustom.java:20)

    }

    //Nesse caso é lançada exceção porque LocalDate não possui hora, minuto ou segundo.

}
