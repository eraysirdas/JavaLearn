package JDBC.OgrenciDatabase;

import java.sql.*;

public class OgrenciData {
    Connection conn =null;
    public OgrenciData(){
        try {
            veriTabaninaBaglan();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void finalize() throws Throwable { // son olarak çalışan metottur.
        System.out.println("VERİ TABANI SONLANDIRILDI");
        conn.close();
    }

    private void veriTabaninaBaglan() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password ="ErayE52+";

        conn= DriverManager.getConnection(url,username,password);
    }
    public Ogrenci getOgrenci(String ogrNo) throws SQLException {
        //veriTabaninaBaglan(); yapıcıda cagırdıgım ıcın tekrar tekrar metotlarda çağırmqama gerek kalmadı

        Ogrenci o = new Ogrenci();
        o.setStuNumber(ogrNo);

        String query = "select * from ogrenciler where ogrenciNo="+ogrNo;

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        st=conn.createStatement();
        if(rs.next()){
            o.setId(rs.getInt(1));
            o.setStuNumber(ogrNo);
            o.setUsername(rs.getString(3));
            o.setStuName(rs.getString(4));
            o.setStuSurname(rs.getString(5));
        }
        else {
            o = null;
        }
        return o;
    }
    public void ogrenciEkle(Ogrenci o) throws SQLException {
        //veriTabaninaBaglan();

        String query = "insert into ogrenciler (ogrenciNo,username,ogrenciAdi,ogrenciSoyadi) values (?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(query);

        st.setString(1,o.getStuNumber());
        st.setString(2,o.getUsername());
        st.setString(3,o.getStuName());
        st.setString(4,o.getStuSurname());

        int count = st.executeUpdate();
        System.out.println("Öğrenci başarı ile eklendi...");
    }
    public void ogrenciSil(Ogrenci o) throws SQLException{
        //veriTabaninaBaglan();
        String query = "delete from ogrenciler where ogrenciNo="+o.getStuNumber();
        Statement st = conn.createStatement();
        int count = st.executeUpdate(query);
        if(count ==1){
            System.out.println("öğrenci silindi");
        }else{
            System.out.println("öğrenci bulunamadı");
        }

    }
    public void ogrenciGuncelle(Ogrenci o,String no) throws SQLException {
        //veriTabaninaBaglan();

        String query = "update ogrenciler set ogrenciNo='"+o.getStuNumber() +
                "', username='"+o.getUsername()+"', ogrenciAdi='"+o.getStuName()+
                "', ogrenciSoyadi='"+o.getStuSurname()+"'where ogrenciNo='"+no+"'";

        Statement st = conn.createStatement();
        int count = st.executeUpdate(query);
        if(count ==1){
            System.out.println("Öğrenci güncellendi");
        }else{
            System.out.println("öğrenci bulunmadığı için güncellenmedi");
        }
    }
}
