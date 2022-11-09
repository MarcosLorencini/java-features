package localization.formats.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_Instance {

    //A classe SimpleDateFormat permite criar formatos mais personalizados para apresentar Data e Hora,
    //como dd/MM/yyyy HH:mm:ss. A seguir, as letras mais importantes utilizadas na formatação para o
    //exame:
    //• y → Ano (2019, 19)
    //• M → Mês (8, 08, Ago, Agosto)
    //• d → Dia (06)
    //• h → Hora em formato AM/PM
    //• H → Hora em formato 24H
    //• m → Minutos
    //• s → Segundos
    //Em geral (existem exceções), quanto mais letras forem utilizadas, mais extenso é o formato
    //apresentado. Por exemplo:
    //• M → 8
    //• MM → 08
    //• MMM → Ago
    //• MMMM → Agosto


    public static void main(String[] args) {
        //1. É possível criar formatos personalizados para formatar um Date utilizando o construtor de
        //SimpleDateFormat.
        SimpleDateFormat simpleDateTime = new SimpleDateFormat("dd MM yy - HH mm ss");
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd MM yy");
        SimpleDateFormat simpleTime = new SimpleDateFormat("HH mm ss");

        Date date = new Date(1000000000000L); // data em quantidade de milissegundos desde 01/01/1970

        System.out.println(simpleDateTime.format(date));
        System.out.println(simpleDate.format(date));
        System.out.println(simpleTime.format(date));

        //08 09 01 - 22 46 40
        //08 09 01
        //22 46 40



    }
}
