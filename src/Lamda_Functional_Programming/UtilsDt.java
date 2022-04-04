package Lamda_Functional_Programming;

public class UtilsDt {

    public static void printInTheSameLineWithSpace(Object str) {
        System.out.print(str+" ");
    }

    public static boolean checkToBeEven(int x) {
        return x%2==0;
    }
    public static boolean checkToBeOdd(int x) {
        return x % 2 != 0;
    }
    public static int getSquare(int x) {
        return x*x;
    }
    public static int getCube(int x) {
        return x * x * x;
    }
    public static double getHalf(int x) {
        return x/2.0;
    }
    public static char getLastChar(String str) {
      return   str.charAt(str.length()-1);
    }
    public static char getStartWtih(String str) {
        return   str.charAt(0);
    }



}
