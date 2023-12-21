package InputOutputİslemleri.InputStream;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try { //FileNotFoundException bu hata durumununda yani yanlıs dosya yolu verıldıgınde IOExceptiıonu istediği için try catche aldık

            //File dosya = new File("src/InputOutputİslemleri/InputStream/patika.txt");
            //FileInputStream input = new FileInputStream(dosya); bu şeekilde de yol verebiliriz

            FileInputStream input = new FileInputStream("src/InputOutputİslemleri/InputStream/patika.txt"); //okuması için bir yol verdik.
            System.out.println("Kullanabilir byte sayısı : "+input.available()); // metindeki okunmamıs byte sayısını verir.
            input.skip(10); //10 byte atlama yapar
           // TODO: Dosyayı okuma işlemi

            int i =input.read(); // byte byte okuma yapar her cagırıldıgında sonraki byte gecer.
            while(i!=-1) { // read() dan -1 degeri gelirse bu dosyada okunacak bir şeyin kalmadığını veya bos oldugunu ifade eder.
                System.out.print((char) i); //i değeri integer olduğugu için karakter dızısıne donusturduk

                i=input.read(); // sonraki byte dizisine gecmsını sagladık
            }
            input.close(); // FileInputStream olustugu andan ıtıbaren arkada calısmaya devam eder bu yuzden bunu sonlandırmamız gerekiyor.

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
