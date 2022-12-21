package fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_CreationDoesntExists {

    //É possível criar uma instância de Path apontando para um diretório ou arquivo que não existe.

    public static void main(String[] args) {

        String userHome = System.getProperty("user.home");
        System.out.println("User home: " + userHome);

        Path path = Paths.get(userHome, "arquivoQueNaoExiste.txt" );
        System.out.println("Path: " + path);
    }

    //User home: C:\Users\Marcos
    //Path: C:\Users\Marcos\arquivoQueNaoExiste.txt
}
