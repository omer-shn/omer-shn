package Classes;

public class BookMain {
    public static void main(String[] args) {



        Book sta  = new Book();

        sta.cate="Book";
        sta.item="Near the Blackthree";
        sta.price=12;
        sta.quantity=1;
        sta.code='N';

        sta.cate1="Book";
        sta.item1="The Book that Fell into the River";
        sta.price1=18;
        sta.quantity1=4;
        sta.code1='N';

        sta.cate2="Book";
        sta.item2="Battal Gazi With the Kids";
        sta.price2=10;
        sta.quantity2=15;
        sta.code2='S';

        System.out.println("Cathegory :"+sta.cate+"\nItem :"+sta.item+"\nPrice :"+sta.price+"\nQuantity :"+sta.quantity+"\nCode :"+ sta.code);
        System.out.println();
        System.out.println("Cathegory :"+sta.cate1+"\nItem :"+sta.item1+"\nPrice :"+sta.price1+"\nQuantity :"+sta.quantity1+"\nCode :"+ sta.code1);
        System.out.println();
        System.out.println("Cathegory :"+sta.cate2+"\nItem :"+sta.item2+"\nPrice :"+sta.price2+"\nQuantity :"+sta.quantity2+"\nCode :"+ sta.code2);

    }
}
