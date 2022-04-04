package Lamda_Functional_Programming;

import java.util.stream.IntStream;

public class FpDt07 {

    public static void main(String[] args) {
        System.out.println(sumit(10));
        System.out.println(sum1(5));
        System.out.println(sum2(10));
        System.out.println(sumEven(10));
        System.out.println(sumEven1(10));
        System.out.println(sumOdd(10));
        System.out.println(sumOdd1(10));


    }

    // 1den x e kada tamsayıları toplayan code yazınız ---corejava & lambda
    public static int sumit(int x) {
        int sum = 0;
        for (int a = 1; a <= x; a++) {
            sum += a;
        }
        return sum;
    }

    //Lambda
    public static int sum1(int x) {
        return IntStream.range(1, x + 1).sum();
    }

    public static int sum2(int x) {
        return IntStream.rangeClosed(1, x).sum(); // ikinci değerde toplamaya dahildir
    }

    //1 den x e kadar olan çift sayıları topla.
    public static int sumEven(int x) {
        return IntStream.rangeClosed(1, x).filter(UtilsDt::checkToBeEven).sum(); // ikinci değerde toplamaya dahildir,yani (int startInclusive, int endInclusive)
    }

    public static int sumEven1(int x) {
        return IntStream.iterate(2, t -> t + 2).limit(x).sum(); // Sout'ta x 10 dersek 10 adet çift element toplar yani 10 kadar değil
    }

    //İlk 10 pozitif tek sayıyı toplayan code
    public static int sumOdd(int x) {
        return IntStream.rangeClosed(1, x).filter(UtilsDt::checkToBeOdd).sum();
    }

    public static int sumOdd1(int x) {
        return IntStream.iterate(1, t -> t + 2).limit(x).sum();
    }

    









    }
