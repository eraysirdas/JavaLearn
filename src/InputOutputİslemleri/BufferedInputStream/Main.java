package InputOutputİslemleri.BufferedInputStream;


import java.io.*;

//TODO büyük veriler içeren filelarda ara bellek oluşturup süreçi hızlandırmaya yarar
public class Main {
    public static void main(String[] args) {
        try {
            String data = "yeni eklenenen metin";
            FileOutputStream outputStream = new FileOutputStream("src/InputOutputİslemleri/BufferedInputStream/metin.txt",true);
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(outputStream);// içine FileInputStream verip dosyaların bundan yazılmasını saglıcaz

            byte[] bufferedOutputByte= data.getBytes();
            bufferedOutput.write(bufferedOutputByte);
            bufferedOutput.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileInput = new FileInputStream("src/InputOutputİslemleri/BufferedInputStream/metin.txt" );
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);// içine FileInputStream verip dosyaların bundan okunması saglıcaz

            int i = bufferedInput.read();
            while (i!=-1){
                System.out.print((char)i); // tür donusumune zorladık

                i = bufferedInput.read(); //sornaki bytlara gecmek ıcın cagırdık
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
