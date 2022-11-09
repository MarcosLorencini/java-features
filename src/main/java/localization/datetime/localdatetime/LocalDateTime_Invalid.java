package localization.datetime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Invalid {

    //Será lançada a exceção DateTimeException ao tentar criar uma data ou hora inválida.

    public static void main(String[] args) {
        // lança exceção: não existe 31 de abril

        System.out.println(LocalDateTime.of(2019,4,31,9,20));
    }
}
