package Techday12Overloading;

public class MethodOverloadin02 {
    public static void main(String[] args) {


        System.out.println(add(19, 21));
        System.out.println(mul(12, 4));
        System.out.println(sub(109, 10));
        System.out.println(volume(4, 3, 7));

    }

            public static int add(int a,int b) {
                return a+b;}
            public static  double mul(double a, double b){
                return a*b; }
            public static  int sub(int a,int b) {
                return a-b;}
            public static  int volume( int a,int b, int c){
                return  a*b*c;}




}
