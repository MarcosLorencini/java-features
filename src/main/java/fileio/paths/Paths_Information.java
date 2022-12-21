package fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Information {

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println("User home: " + userHome + "\n");
        Path path1 = Paths.get(userHome, "arquivos", "arquivo.txt"); // absoluto
        System.out.println("Representação em String: " + path1.toString());
        System.out.println("Nome do Arquivo: " + path1.getFileName());
        System.out.println("Diretório Superior: " + path1.getParent());
        System.out.println("Diretório Raiz: " + path1.getRoot());
        System.out.println("É absoluto?: " + path1.isAbsolute());
        System.out.println();
        Path path2 = Paths.get("home", "Marcos", "arquivos"); // relativo
        System.out.println("Representação em String: " + path2.toString());
        System.out.println("Nome do Arquivo: " + path2.getFileName());
        System.out.println("Diretório Superior: " + path2.getParent());
        System.out.println("Diretório Raiz: " + path2.getRoot());
        System.out.println("É absoluto?: " + path2.isAbsolute());


    }

    //User home: C:\Users\Marcos
    //
    //Representação em String: C:\Users\Marcos\arquivos\arquivo.txt
    //Nome do Arquivo: arquivo.txt
    //Diretório Superior: C:\Users\Marcos\arquivos
    //Diretório Raiz: C:\
    //É absoluto?: true
    //
    //Representação em String: home\Marcos\arquivos
    //Nome do Arquivo: arquivos
    //Diretório Superior: home\Marcos
    //Diretório Raiz: null
    //É absoluto?: false
}
