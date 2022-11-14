package lambda.usingstreams.primitives;

import java.util.Random;
import java.util.stream.IntStream;

public class Streams_Generate {

    //É possível gerar Streams infinitos com o método generate.

    public static void main(String[] args) {
        // Cria Stream infinito de números aleatórios
        System.out.println(" InputStream infinito de números aleatórios");
        IntStream.generate(() -> new Random().nextInt())
                .limit(3)
                .forEach(System.out::println);
        
    }
}
