package JDBC.OgrenciDatabase;

public class Ogrenci {
    private int id;
    private String username;
    private String stuNumber;
    private String stuName;
    private String stuSurname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSurname() {
        return stuSurname;
    }

    public void setStuSurname(String stuSurname) {
        this.stuSurname = stuSurname;
    }

    public void printDisplay(){
        System.out.println("ID : "+id+"| Kullanıcı Adı : "+username+" | Ad Soyad : "+stuName+" "+stuSurname+"| Numara : "+stuNumber);
    }
}
