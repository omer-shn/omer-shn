package Techday10ForWhile;

import java.util.Scanner;

public class LoopWhile1 {
    public static void main(String[] args) {

        // Hello 5 times

        for(int he=1; he<6; he++) {
            System.out.println("Hello");
        }

        System.out.println();

        int hel =1;
        while (hel<6) {
            System.out.println("Hello");
            hel++;
        }

        //12 to 67

        int wh= 12;

        while (wh<68) {
            if(wh%2!=0) {
                System.out.print(wh + " ");
            }
            wh++;
        }
        System.out.println();
        // 12 -67  sum

        int we=12;
        int sum =0;
        while (we<68) {
            sum =sum +we;

            we++;

        }
        System.out.println(sum);

        System.out.println();

        //to sum the digits number ask user

        Scanner scn =new Scanner(System.in);
        System.out.println("Enter an integer");
        int nn = scn.nextInt();

        int sumdigit =3;
        while (nn>0) {

            sumdigit = sumdigit + sumdigit%10;

            nn= nn/10;


        }
        System.out.println(sumdigit);

        //
        System.out.println();
        //
        int n=3;
        int m=1;

        while (m<11) {
            System.out.println(n + "x" + m + "=" + n*m);
            m++;
        }










    }
}
