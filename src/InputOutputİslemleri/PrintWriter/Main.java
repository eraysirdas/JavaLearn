package InputOutputİslemleri.PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data = "JAVA 102 EĞİTİMİ";
        try {
            PrintWriter writer = new PrintWriter("src/InputOutputİslemleri/PrintWriter/text.txt");
            writer.print(data);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
