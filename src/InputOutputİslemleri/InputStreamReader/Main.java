package InputOutputİslemleri.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("src/InputOutputİslemleri/InputStreamReader/java.txt");

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int i = inputStreamReader.read(); // FileInputStream yerine REader ile çağırarak yazdırma formatını UTF8 olarak default ayarı ıle yazdırdık
            while(i!=-1){
                System.out.print((char)i);
                i = inputStreamReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
