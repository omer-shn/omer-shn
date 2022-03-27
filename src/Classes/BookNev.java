package Classes;

public class BookNev {

    public static void main(String[] args) {



    Book booknev0 = new Book("History","Seljuk Civilization",18,4,'H');
    Book booknev1 = new Book("History","Ottoman Middle Age",24,2,'H');
    Book booknev2 = new Book(20);
    Book booknev3 = new Book(25,3);
    Book booknev4 = new Book("Geography");


        System.out.println(booknev0.cate+" "+booknev0.item+" "+booknev0.price+" "+booknev0.quantity+" "+booknev0.code);
        System.out.println(booknev2.price);
        System.out.println("Price :"+booknev3.price+" "+"Quantity :"+booknev3.quantity);
        System.out.println(booknev4.cate);



    }

}
