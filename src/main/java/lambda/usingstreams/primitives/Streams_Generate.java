package lambda.usingstreams.primitives;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Streams_Generate {

    //É possível gerar Streams infinitos com o método generate.

    public static void main(String[] args) {
        // Cria Stream infinito de números aleatórios
        System.out.println(" InputStream infinito de números aleatórios");
        IntStream.generate(() -> new Random().nextInt())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n DoubleStream infinito de números aleatórios");
        DoubleStream.generate(Math::random)
                .limit(3)
                .forEach(System.out::println);

        // IntStream infinito de números aleatórios
        //2111846625
        //-1692075394
        //122693397
        // DoubleStream infinito de números aleatórios
        //0.913037010633669
        //0.23669861350384735
        //0.32655918031847697

        //Nesse caso os Streams são realmente infinitos. Só foram apresentados 3 números de cada pois
        //existe a operação limit, caso contrário a execução do programa também seria sem fim.

    }
}
