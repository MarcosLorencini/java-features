package lambda.usingstreams;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

public class Streams_ReuseStream {

    //Não é possível chamar mais de uma operação final no mesmo Stream.

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(7,2,1);
        stream.forEach(System.out::println); // imprime elementos do Stream
        stream.forEach(System.out::println); // LANÇA EXCEÇÃO - o Stream já estava fechado
    }

    //7
    //2
    //1
    //Exception in thread "main" java.lang.IllegalStateException: stream has already been
    //operated upon or closed
    //  at
    //java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
    //  at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580)
    //  at
    //org.j6toj8.streams.usingstreams.Streams_ReuseStream.main(Streams_ReuseStream.java:1
    //1)

}
