package Techday21VarArgsAccess;

public class VarArgs1 {
    public static void main(String[] args) {
        sum(2, 11);
        sum(3,8,-4);
        sum(10, 30, 60, -70, 80);

        sums(2, 11);
        sums(3,8,-4);
        sums(10, 30, 60, -70, 80);

    }
    public static void sum(int mul, int... numbers) {  //İLK DEĞER (mul) DİĞERLERİNİN TOPLAMINI ÇARPAR
        //İKİNCİ DEĞER (mul2) TANIMLANDI FAKAT KULLANILMADI ,İKİNCİ DEĞERLER İLEME ALINMAZ
        int adding = 0;
        for (int a : numbers) {
            adding += a;
        }
        System.out.println(adding*mul);

    }

    //İKİNCİ DEĞER (mul2) TANIMLANDI FAKAT KULLANILMADI ,İKİNCİ DEĞERLER İşLEME ALINMAZ, SONUÇ DEĞİŞİR
    public static void sums(int mul,int mul2, int... numbers) {

        int adding = 0;
        for (int a : numbers) {
            adding += a;
        }
        System.out.println(adding*mul);

    }
}
