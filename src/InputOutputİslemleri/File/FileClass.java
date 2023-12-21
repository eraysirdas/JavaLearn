package InputOutputİslemleri.File;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) {
        File dosya = new File("src/InputOutputİslemleri/File/deneme.txt"); //acılacak dosyanın konum ve adını verdik.
        try {
            if(dosya.createNewFile()) // verdiğimiz dosyanın oluşturulmasını sağlar IOException miras aldığı için de try catche aldık.
            {
                System.out.println(dosya.getName() +" dosyası oluşturuldu.");
            }else{
                System.out.println(dosya.getName() +" dosyası zaten mevcut!");
                dosya.delete(); //dosyayı silmeye yarar
                System.out.println(dosya.getName() + " dosyası silindi");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()); //hatanın yazıdırlmasını sağlar
        }

        File dizin = new File("src/InputOutputİslemleri/File/dosya"); //olusturmak istediğimiz dosyanın adını ve yolunu blirttik
        dizin.mkdir(); //dosya oluşturmamızı sağlar
        File dosya2 = new File("src/InputOutputİslemleri/File/dosya/dizin.txt"); //oluştyrduğumuz dosyanın içinde dizin.txt olusturduk
        try {
            if(dosya2.createNewFile())
            {
                System.out.println(dosya2.getName() +" dosyası oluşturuldu.");
            }else{
                System.out.println(dosya2.getName() +" dosyası zaten mevcut!");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File dizin2 = new File("src/InputOutputİslemleri/File/anadosya/altdosya");
        dizin2.mkdirs(); // mkdirs de olmayan bir üst dizini d yaratmayı yarar.
        File dosya3 = new File("src/InputOutputİslemleri/File/anadosya/altdosya/dizin2.txt"); //oluştyrduğumuz dosyanın içinde dizin.txt olusturduk
        try {
            if(dosya3.createNewFile())
            {
                System.out.println(dosya3.getName() +" dosyası oluşturuldu.");
            }else{
                System.out.println(dosya3.getName() +" dosyası zaten mevcut!");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File dizin4 = new File("src/InputOutputİslemleri/File/dosya");
        String[] liste =dizin.list();

        for(String str : liste){
            System.out.println(str);
        }

    }

}
