package JDBC.FirstFile;
// TODO işlem sırası
//1. import java.sql
//2. load and register the driver
//3. create connection
//4. create a statement
//5. execute the query
//6. process the results
//7. close

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/school"; //database adresini verdik
        String username ="root";
        String password = "ErayE52+";
        String query = "select * from ogrenciler"; // butun ogrencileri cagırdığımız bir sorgu oluşturduk

        Connection conn =null;
        conn=DriverManager.getConnection(url,username,password); // database bağlantısını sağladık

        //Statement st = conn.prepareStatement(query); //SQL sorgularını veritabanına göndermek için kullanılan bir araçtır. temel sql komutlarının
        // çalışmasını ve bize değer döndürmesini sağlar //normal statment güvenliği düşüktür preparestatmentin yuksektır
        PreparedStatement st = conn.prepareStatement(query);
        ResultSet rs = st.executeQuery(query); // ResultSet veritabanından alınan verileri tutmak ve işlemek için kullanılır.
        //Statement sınıfının executeQuery metodu, bir SELECT sorgusunu çalıştırır ve bir ResultSet nesnesi döndürür.

        while(rs.next()){ //ResultSet üzerinde next metodu kullanılarak veri kümesinde bir sonraki satıra geçilir.
            int id = rs.getInt("id"); //getInt, getString, getDouble gibi metotlarla belirli sütunlardaki verilere erişilebilir.
            String ogrenciNo=rs.getString("ogrenciNo");
            String kullaniciAdi = rs.getString("username");
            String ad = rs.getString("ogrenciAdi");
            String soyad = rs.getString("ogrenciSoyadi");

            System.out.println("ID : "+id+" Öğrenci No : "+ogrenciNo+" Kullanıcı Adı : "+kullaniciAdi+" Adı : "+ad+" Soyadı : "+soyad);
        }
        //TODO normal statment
        //query ="insert into ogrenciler (ogrenciNo,username,ogrenciAdi,ogrenciSoyadi) values ('20190215','erensrds','eren','sırdaş')"; yeni bir veri ekledik, id bilgisini girmmek
        //girmek istediğimiz sütünları belirttik.
        //int count = st.executeUpdate(query); yaptıgımız bu degısıklıgı veritabanınında uyguladık.
        //TODO prepareStatment
        query = "insert into ogrenciler (ogrenciNo,username,ogrenciAdi,ogrenciSoyadi) values (?,?,?,?)"; // bilgilerini sonradan gireceğiz.
        st = conn.prepareStatement(query); // bunların gecerlı olabilmesi için tekrar statment hazır hale getırılmeli

        st.setString(1,"20190210"); // değer atamalarını ındex numaralarına göre verdik
        st.setString(2,"fatihakta");
        st.setString(3,"Fatih");
        st.setString(4,"Aktaş");

        int count = st.executeUpdate(); // yaptıgımız bu degısıklıgı veritabanınında uyguladık.
        System.out.println(count+ " satır etkilendi!");

        //TODO dışarıdan gelen verileri veri tabanına ekleme

        Scanner sc = new Scanner(System.in);
        System.out.print("öğrenci numarası girin : ");
        String ogrNo = sc.nextLine();
        System.out.print("Kullanıcı adı girin : ");
        String kullaniciAd= sc.nextLine();
        System.out.print("Ad girin : ");
        String isim = sc.nextLine();
        System.out.print("Soyadı girin : ");
        String soyad = sc.nextLine();

        st.setString(1,ogrNo);
        st.setString(2,kullaniciAd);
        st.setString(3,isim);
        st.setString(4,soyad);

        count = st.executeUpdate(); // yaptıgımız bu degısıklıgı tekrardan veritabanınında uyguladık.
        System.out.println(count+ " satır etkilendi!");


        st.close();
        conn.close();

    }
}
