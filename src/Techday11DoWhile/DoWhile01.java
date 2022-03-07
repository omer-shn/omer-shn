package Techday11DoWhile;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {


      //  int k=1;
        Integer k =1;

        do {
            System.out.println("selam");
            k++;
        } while (k < 1);

        //

        Scanner scan =new Scanner(System.in);

        int n=0;

        do {
            System.out.println("Enter an integer");
        n = scan.nextInt();
        if(n<100) {
            System.out.println("won");
        }

        }while (n<100);
        System.out.println("lost");

    }
}