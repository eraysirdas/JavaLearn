package InputOutputİslemleri.OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        String data = "üğşiö";
        try {
            fileOutputStream = new FileOutputStream("src/InputOutputİslemleri/OutputStreamWriter/data.txt");
            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutputStream);

            fileWriter.write(data); // dogurdan bytler ile ugrasmadan yazdırdık utf8 foramtında
            fileWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
