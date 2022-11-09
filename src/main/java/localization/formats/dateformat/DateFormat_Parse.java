package localization.formats.dateformat;

import java.text.DateFormat;
import java.text.ParseException;

public class DateFormat_Parse {

    //Também é possível transformar String em Date utilizando o método parse.

    public static void main(String[] args) {
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat timeInstance = DateFormat.getTimeInstance(DateFormat.SHORT);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

        String date = "08/09/2001";
        String time = "22:46:40";
        String dateTime = "08/09/2001 22:46:40";

        try {
            System.out.println(dateInstance.parse(date));
            System.out.println(timeInstance.parse(time));
            System.out.println(dateTimeInstance.parse(dateTime));
            System.out.println(dateTimeInstance.parse(date)); //// exceção, pois date não tem hora
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        //Sat Sep 08 00:00:00 BRT 2001
        //Thu Jan 01 22:46:00 BRT 1970
        //Sat Sep 08 22:46:00 BRT 2001
        //Unparseable date: "08/09/2001"

        //Perceba que ocorreu uma exceção ao tentar converter uma data utilizando um formatar que
        //espera Data e Hora.

    }
}
