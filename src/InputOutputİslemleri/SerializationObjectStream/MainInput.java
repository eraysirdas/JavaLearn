package InputOutputİslemleri.SerializationObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainInput {
    public static void main(String[] args) {
        Car c1 = new Car("Auidi","A3"); //objemiz
        try {
            FileInputStream inputStream = new FileInputStream("src/InputOutputİslemleri/SerializationObjectStream/araba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Car newCar = (Car) objectInputStream.readObject(); // okunacak veri Car oldugu için ve bir nesne oldugu için boyle yaptık.
            System.out.println(newCar.getBrand()); // marka ve modeli ekranda bastırdık bu verileri kaydettiğimiz not defterinden aldık.
            System.out.println(newCar.getModel());

            inputStream.close();
            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
