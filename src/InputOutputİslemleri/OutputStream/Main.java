package InputOutputİslemleri.OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String yazi = "Eray Sirdas\nJava Ogreniyorum";
        File dosya = new File("src/InputOutputİslemleri/OutputStream/metin.txt");
        try {
            FileOutputStream output = new FileOutputStream(dosya,true);
            // bu da bir metin dosyaysına yazı yazıdrmamızı saglar burada içine eklendikce verilerin kalması için apprend true ekledik
            // false oldugunda her sferınde verileri siler.
            byte[] yaziByte = yazi.getBytes(); //getbytes metotu yazıyı byte cevirmeye yarar cunku metin file ıcınde byte foramtında tutulur, getbtes metotu byte[] ile
            //calıstıgı ıcın bu degıskene attık.
            output.write(yaziByte); // write de bu metnı yolunu verdigimiz dosyaya yazdırmaya yarar.
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
