package KitapSiraliyiciProje;

public class Book {
    private String bookName;
    private int page;
    private int releaseDate;
    private String writer;

    public Book(String bookName, int page, int releaseDate, String writer) {
        this.bookName = bookName;
        this.page = page;
        this.releaseDate = releaseDate;
        this.writer = writer;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getReleaseDate() {
        return this.releaseDate;
    }
}
