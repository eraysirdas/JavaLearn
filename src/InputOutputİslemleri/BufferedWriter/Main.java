package InputOutputİslemleri.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "PAtika deneme kodları";
        try {
            FileWriter fileWriter = new FileWriter("src/InputOutputİslemleri/BufferedWriter/metin.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
