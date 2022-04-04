package Books;

public class Book {
   private String bookName;
   private String authorName;

    public Book(String bookName, String authorName, int pressYear, double price, int no) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pressYear = pressYear;
        this.price = price;
        this.no = no;
    }
    public Book(){ }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPressYear() {
        return pressYear;
    }

    public void setPressYear(int pressYear) {
        this.pressYear = pressYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    private int pressYear;
   private double price;
   private int no;

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pressYear=" + pressYear +
                ", price=" + price +
                ", no=" + no +
                '}';
    }
}
