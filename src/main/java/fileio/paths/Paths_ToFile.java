package fileio.paths;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_ToFile {

    //É possível converter um Path para um File.

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println("User home: " + userHome);

        Path path = Paths.get(userHome, "arquivoQueNaoExiste.txt" );
        System.out.println("Path: " + path);

        File file = path.toFile();
        System.out.println("File: " + file);
    }

    //User home: C:\Users\Marcos
    //Path: C:\Users\Marcos\arquivoQueNaoExiste.txt
    //File: C:\Users\Marcos\arquivoQueNaoExiste.txt
}
