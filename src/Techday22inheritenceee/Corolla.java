package Techday22inheritenceee;

import java.sql.SQLOutput;

public class Corolla extends Toyota{

    String color="Blue";
    String productPlace="Turkey";
    int price;
    protected int doorNumbers=5;
    boolean Iselectric;

    public static void main(String[] args) {

        Corolla arb1 = new Corolla();//Buradan çağrılan yukarı kadar hepsini gezebilir.

        Toyota arb2 = new Corolla(); //Buradan çağrılan Toyota classından gelir(sınırlama)

        Araba arb3 = new Corolla();//Buradan çağrılan Araba class'ında gelir (sınırlama)

        String st = new String("Filiz");

        System.out.println(arb1.Iselectric);

        System.out.println(arb1.doorNumbers);
        System.out.println(arb1.productPlace);
        System.out.println(arb2.color); //Kendi class'ında değer blue fakat arb2'nin Datatype'ı Tototadır
        //Totota class'nda ise color olmamasına rağmen oradan Araba class'ına çıkar ve white değerini getirir.
        System.out.println((arb2.productPlace));
        //productPlace objesini örnek verebiliriz. Bu obje üç class'dada tanımlı değerleri farklı.
        //arb1 objesi ile çağrılırsa Corolla Classından
        //arb2 objesi ile çağrılırsa Toyota classından
        //arb3 objesi ile çağrılırsa Araba classından gelir...

    }

}






