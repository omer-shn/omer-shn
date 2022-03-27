package Techday22İnnheritancee;

public class İsci  extends Muhasebe{

     protected String statu;
     protected String meslek;
     protected String sendika;

    public İsci() {
         System.out.println("isci parametresiz constructor");
     }

    public static void main(String[] args) {

        İsci isci1 =new İsci();
        isci1.meslek="kaynak";
        isci1.saatUcreti=20;
        isci1.isim="Mehmet";
        isci1.maas= isci1.maasHesapla();
        System.out.println(isci1.isim+" "+isci1.maas);


    }
}
