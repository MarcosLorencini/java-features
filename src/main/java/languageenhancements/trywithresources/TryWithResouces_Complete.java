package languageenhancements.trywithresources;

import java.io.*;
import java.nio.file.Files;

public class TryWithResouces_Complete {
    // chama automaticamente o método close() dos recursos que estão sendo
    //utilizados
    public static void main(String[] args) throws IOException {
        File file = new File("arquivo.txt");
        File file2 = new File("arquivo2txt");

        try(PrintWriter writer = new PrintWriter(file)) {
            // escreve no arquivo.txt
            writer.println("Olá Mundo!");
        }

        try(BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            // imprime no console uma linha do arquivo.txt
            System.out.println(reader.readLine());
        }

        try(BufferedReader reader = Files.newBufferedReader(file.toPath());
            BufferedWriter writer = Files.newBufferedWriter(file2.toPath())) {
            // lê a linha do arquivo.txt e escreve no arquivo2.txt
            writer.write(reader.readLine() + "2");
        }

        try(BufferedReader reader = Files.newBufferedReader(file2.toPath())) {
            // imprime no console uma linha do arquivo2.txt
            System.out.println(reader.readLine());
        }
    }
}
