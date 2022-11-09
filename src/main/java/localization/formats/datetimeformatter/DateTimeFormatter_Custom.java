package localization.formats.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Custom {

    //É possível obter instâncias personalizadas de DateTimeFormatter.

    public static void main(String[] args) {
        LocalDateTime localDT = LocalDateTime.of(2019, 8, 6, 11, 40);

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd MM yy - HH mm ss");

        System.out.println(localDT.format(customFormatter));

        //  06 08 19 - 11 40 00

        //Para criar um DateTimeFormatter personalizado é necessário conhecer o que cada letra doformato representa.
        // Volte na seção de SimpleDateFormat caso não se lembre.
    }
}
