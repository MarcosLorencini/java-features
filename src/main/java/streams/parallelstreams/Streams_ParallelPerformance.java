package streams.parallelstreams;

import java.util.stream.IntStream;

public class Streams_ParallelPerformance {

    //Em coleções com muitos objetos pode haver um ganho considerável de performance.

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(0, Integer.MAX_VALUE)
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .ifPresent(n -> System.out.println("Tempo stream sequencial: "+ (System.currentTimeMillis() - inicio)));

        long inicio2 = System.currentTimeMillis();
        IntStream.range(0, Integer.MAX_VALUE)
                .parallel()
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .ifPresent(n -> System.out.println("Tempo stream paralelo: " + (System.currentTimeMillis() - inicio2)));

    }

    //Tempo stream sequencial: 10226
    //Tempo stream paralelo: 3897

    //Perceba que na máquina onde o código foi executado, a execução em paralelo demorou apenas
    //15% do tempo da execução sequencial. Esse não é um teste minucioso, mas mostra o potencial
    //de Streams paralelos.
}
