package InputOutputİslemleri.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("src/InputOutputİslemleri/PrintStream/print.txt");
            output.print("eray sırdas"); // write() yerine print kullandık PrintStream  çıktı verilerini bayt
            // yerine yaygın olarak okunabilir biçimde (metin) yazmak için kullanılabilir.
            output.close();
         } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
