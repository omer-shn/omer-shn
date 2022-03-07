package Classes;

public class Myoverloading {
    public static void main(String[] args) {

        System.out.println(add(11, 89));

        subs(50,4); // for void

        System.out.println(add(23,4,11));

        System.out.println(add(12, 6.4));

    //    System.out.println(add(2.4, 48));// ilk değer double göründüğü ve aşağıdaski method tanımı ise
                                              // integer olduğu için yürütmez

    //    System.out.println(add(3, 6, 7,9)); //dört değer olduğu için yütümez
    }


    public static int add(int a, int b) {
        return a+b;
    }
    public static void subs(int a, int b){ // void için print beraberindedir.
        System.out.println(a-b);
    }
    public static double add(double a,double b, double c) {

        return a+b+c;
    }

    public  static  double add( int a, double b) {
        return a+b;
    }

}
