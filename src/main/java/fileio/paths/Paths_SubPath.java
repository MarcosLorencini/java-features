package fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_SubPath {

    //É possível criar Sub-Paths a partir de um Path.
    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println("User home: " + userHome);

        Path path = Paths.get(userHome, "arquivos", "arquivo1.txt");
        System.out.println("Path: " + path);

        Path subPath1 = path.subpath(0, 1);
        System.out.println(subPath1);

        Path subPath2 = path.subpath(0, 2);
        System.out.println(subPath2);

        Path subPath3 = path.subpath(0, 3);
        System.out.println(subPath3);

        Path subPath4 = path.subpath(0, 4);
        System.out.println(subPath4);

        Path subPath5 = path.subpath(3, 5); // EXCEÇÃO, pois só existem 4 elementos no path


    }

    //User home: C:\Users\Marcos
    //Path: C:\Users\Marcos\arquivos\arquivo1.txt
    //Users
    //Users\Marcos
    //Users\Marcos\arquivos
    //Users\Marcos\arquivos\arquivo1.txt
    //Exception in thread "main" java.lang.IllegalArgumentException
    //	at java.base/sun.nio.fs.WindowsPath.subpath(WindowsPath.java:687)
    //	at java.base/sun.nio.fs.WindowsPath.subpath(WindowsPath.java:42)
    //	at fileio.paths.Paths_SubPath.main(Paths_SubPath.java:28



}
