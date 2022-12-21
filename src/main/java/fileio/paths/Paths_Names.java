package fileio.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths_Names {

    //É possível recuperar os elementos do Path individualmente.

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println("User home: " + userHome + "\n");

        Path path = Paths.get(userHome, "arquivos", "arquivos.txt");
        int nameCount = path.getNameCount(); // qantidade de elementos no Path
        for(int i = 0; i < nameCount; i++) {
            Path name = path.getName(i);
            System.out.println(name);
        }

    }
}

//User home: C:\Users\Marcos
//
//Users
//Marcos
//arquivos
//arquivos.txt
