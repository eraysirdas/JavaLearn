package InputOutputİslemleri.SerializationObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainOutput {
    public static void main(String[] args) {
        Car c1 = new Car("Auidi","A3"); //objemiz

        try {
            FileOutputStream outputFile = new FileOutputStream("src/InputOutputİslemleri/SerializationObjectStream/araba.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(outputFile); //içine FileOutputStream objessi alır ve objeleri dışarıya çıktı vermek için kullanılır.
            outputStream.writeObject(c1);
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
