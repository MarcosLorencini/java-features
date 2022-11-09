package localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatter_Inverted {

    //Todos os métodos utilizados para format e parse também podem ser invocados diretamente na
    //instância do DateTimeFormatter.

    public static void main(String[] args) {
        LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);
        System.out.println(localDT);
        String format = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDT);
        System.out.println(format);
        TemporalAccessor parse = DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse(format);
        System.out.println(parse);
        System.out.println(LocalDateTime.from(parse));

        //Porém, veja que ao utilizar o método parse diretamente no DateTimeFormatter, é necessário
        //converter o resultado para um LocalDateTime.

        //2019-08-06T11:40
        //2019-08-06T11:40:00
        //{},ISO resolved to 2019-08-06T11:40
        //2019-08-06T11:40



    }
}
