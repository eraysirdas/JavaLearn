package InputOutputİslemleri.ByteArrayIOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] dizi ={1,2,3,4,5};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi,0,5); //ByteArrayInputStream input = new ByteArrayInputStream(dizi) ile aynı şey..

        System.out.println("Kullanabilir byte sayısı : "+input.available());
        int i = input.read();
        while(i!=-1){
            System.out.println(i);
            i=input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String data = "Java102 Dersleri";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();
        try {
            outputStream.write(dataByteArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
