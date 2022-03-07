package Educa;

public class Edu06Methods {

    public static void main(String[] args) {

     /*   String qw="Asım";
        int qa=45;

        here(qw,qa); }

    static void here(String qw, int qa) {
        System.out.println("hello "+qw);
        System.out.println("your age "+qa); */

        //second example//
        /*
        int x=3;
        int y=4;
        int z=add(x,y);
        System.out.println(z);  }
    static int add(int x,int y) {

        int z=x+y;
        return z;

         */
                             //OVERLOADED METHOD //

        int x = add(1, 2,3); // Coution !!aynı değişkene 2 değer atandı.
        System.out.println(x);
        double y=add(1.2, 3.4,5.6,7.1);
        System.out.println(y);
    }

    // 3 method var ve yukarıda dört farklı değer verilebilir aynı değişken için
    //we can assign fours different values for same variable.
    static int add(int a, int b) {
        System.out.println("overloaded method 1");
        return a+b; }
    static int add(int a, int b,int c) {
        System.out.println("overloaded method 2");
        return a+b+c; }
    static int add(int a, int b,int c, int d) {
        System.out.println("overloaded method 3");
        return a+b+c+d;
    }
    // kod bloğunun devamında double kullanıyoruz .Y değişkeniyle kaç değer atandıysa o method çalışır.
    static double add(double a, double b) {
        System.out.println("overloaded method 1");
        return a+b; }
    static double add(double a, double b,double c) {
        System.out.println("overloaded method 2");
        return a+b+c; }
    static double add(double a, double b,double c, double d) {
        System.out.println("overloaded method 3");
        return a+b+c+d;
    }



    }
