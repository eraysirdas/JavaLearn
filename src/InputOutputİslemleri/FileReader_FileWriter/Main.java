package InputOutputİslemleri.FileReader_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "yeni metin eklendi\n";
        try {
            FileWriter fileWriter = new FileWriter("src/InputOutputİslemleri/FileReader_FileWriter/data.txt",true); // OutputStreamReaderin daha gelismıs
            // halidir daha hızlı veri yazdırmamzı sağlar

            fileWriter.write(data);
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileReader fileReader = new FileReader("src/InputOutputİslemleri/FileReader_FileWriter/data.txt"); // InputStreamReader'ın daha gelişmiş halidir.
            int i = fileReader.read();
            while (i!=-1){
                System.out.print((char)i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
