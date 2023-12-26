package JDBC.OgrenciDatabase;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        OgrenciData ogrenciData = new OgrenciData();

        Ogrenci arananOgrenci = ogrenciData.getOgrenci("20190228");
        if(arananOgrenci != null){
            arananOgrenci.printDisplay();
        }

        Ogrenci newOgr = new Ogrenci();
        newOgr.setUsername("cemillbck");
        newOgr.setStuNumber("20190202");
        newOgr.setStuSurname("Bıçak");
        newOgr.setStuName("Cemil");

        ogrenciData.ogrenciEkle(newOgr);
        ogrenciData.ogrenciSil(newOgr);

        newOgr.setUsername("yunussemmiz");
        newOgr.setStuNumber("20190205");
        newOgr.setStuSurname("semiz");
        newOgr.setStuName("yunus");

       try{
           ogrenciData.ogrenciEkle(newOgr);
       }catch(SQLException e){
            System.out.println("Ekleme işlemi başarısız...\n"+e.getMessage());
        }

       newOgr.setUsername("yunusmz");
       ogrenciData.ogrenciGuncelle(newOgr,"20190205");


       ogrenciData = null;
       System.gc(); //garbage collector kullanılmayan işlemleri sonlandırır ve atar
    }
}
