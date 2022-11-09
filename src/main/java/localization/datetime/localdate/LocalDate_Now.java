package localization.datetime.localdate;

import java.time.LocalDate;

public class LocalDate_Now {

    //Um LocalDate representa uma data sem fuso horário, como 2007-12-03.
    //1. A prova geralmente irá utilizar datas no formato americano: mes/dia/ano.
    //2. É possível criar um LocalDate através do método static chamado now.

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
    }
}
