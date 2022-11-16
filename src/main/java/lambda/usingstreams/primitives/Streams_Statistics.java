package lambda.usingstreams.primitives;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Streams_Statistics {

    //É possível gerar várias estatísticas de Streams utilizando a operação summaryStatistics.

    public static void main(String[] args) {
        IntSummaryStatistics summaryStatistics = IntStream.range(0, 10)
                .summaryStatistics();

        System.out.println("Quantidade: " + summaryStatistics.getCount());
        System.out.println("Maior: " + summaryStatistics.getMax());
        System.out.println("Menor: " + summaryStatistics.getMin());
        System.out.println("Soma: " + summaryStatistics.getSum());
        System.out.println("Média: " + summaryStatistics.getAverage());

    }

    //Quantidade: 10
    //Maior: 9
    //Menor: 0
    //Soma: 45
    //Média: 4.5
}
