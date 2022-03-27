package Classes;

public class Book {

    public String cate;
    public String item;
    public int    price;
    public int   quantity;
    public char   code;

    public String cate1;
    public String item1;
    public int    price1;
    public int   quantity1;
    public char   code1;


    public String cate2;
    public String item2;
    public int    price2;
    public int   quantity2;
    public char   code2;

    public Book(String history, String seljuk_cvilization, int i, int i1, char h) {
        cate= "History"; item="Seljuk"; price=22;quantity=2;code='H'; }

    public Book(){ }
    public Book(int pr){ price =pr ;}

    public Book(int pri, int quan) {price= pri; quantity= quan;}

    public Book(String ca) { cate=ca;}

}
