package Techday19passbuValue;

public class PassByValue3 {

    public static void main(String[] args) {

        int population =20000;

        int zone1= pop1(population);
        System.out.println("increase %10 "+zone1);
        int zone2 =pop2(population);
        System.out.println("increase %15 "+zone2);
    }

    public static int pop1(int population) {
        return population*100/90;
    }public  static int pop2(int population) {
        return population*100/85;
    }




}
