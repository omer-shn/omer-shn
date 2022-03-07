package Techday11DoWhile;

public class consnev {


    double price1;
    double price2;
    double quantity1;
    double quantity2;
    double total;

    String potato;
    String carrot;


    public consnev() {
    this.price1=price1;
    this.price2=price2;
    this.quantity1=quantity1;
    this.quantity2=quantity2;

    price1 =5.50;
    price2=4.50;
    quantity1 =3;
    quantity2= 1;
    total =(price1*quantity1)+(price2*quantity2);
}

    public static void main(String[] args) {

        consnev mycons = new consnev();
        System.out.println(mycons.total+">> market expence");




    }


}
