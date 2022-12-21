package fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_ToAbsolute {

    //É possível converter um Path relativo para um absoluto.

    public static void main(String[] args) {

        Path path = Paths.get("arquivos");
        System.out.println(path);
        System.out.println("É absoluto " + path.isAbsolute());

        System.out.println();

        Path absolutePath = path.toAbsolutePath();
        System.out.println(absolutePath);
        System.out.println("É absoluto? " + absolutePath.isAbsolute());
    }

    //arquivos
    //É absoluto false
    //
    //C:\Users\Marcos\development\workspace\java-8-new-features\arquivos
    //É absoluto? true

    //Neste caso a saída do console vai depende do diretório onde a aplicação está sendo executada.
}
