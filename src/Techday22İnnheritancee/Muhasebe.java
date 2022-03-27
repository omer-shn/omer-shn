package Techday22İnnheritancee;

public class Muhasebe extends Personel {

    //Caution Bu class da oluşturulan method (construction) alt class daki ( burada işçi) değerleri çağrılamaz
   protected int saatUcreti;
   protected String statu;
   protected int maas;

  public Muhasebe(){  //constr. oluşturulsdu
       System.out.println("muhasebe parametresiz constructor");

   }


    public static void main(String[] args) {

        Muhasebe clsn1=new Muhasebe();
        clsn1.isim="Ali";
        System.out.println(clsn1.soyisim);



    }

    public int maasHesapla() {
        int maas = 8 * 25 * saatUcreti;
        return maas;
    }
}

