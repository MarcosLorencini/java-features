package localization.formats.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormat_Parse {

    //Também é possível criar Date a partir de String utilizando o método parse.

    public static void main(String[] args) {

        SimpleDateFormat simpleDateTime = new SimpleDateFormat("dd MM yy - HH mm ss");
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd MM yy");
        SimpleDateFormat simpleTime = new SimpleDateFormat("HH mm ss");

        String dateTime = "08 09 01 - 22 46 40";
        String date = "08 09 01";
        String time = "22 46 40";

        try {
            System.out.println(simpleDateTime.parse(dateTime));
            System.out.println(simpleDate.parse(date));
            System.out.println(simpleTime.parse(time));
            System.out.println(simpleDateTime.parse(time)); // exceção, pois time não tem data
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        //Sat Sep 08 22:46:40 BRT 2001
        //Sat Sep 08 00:00:00 BRT 2001
        //Thu Jan 01 22:46:40 BRT 1970
        //Unparseable date: "22 46 40"


    }
}
