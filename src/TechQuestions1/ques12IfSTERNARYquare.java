package TechQuestions1;

import java.util.Scanner;

public class ques12IfSTERNARYquare {
    public static void main(String[] args) {
        /*1)	Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
and print it on the console.

         */
        Scanner square = new Scanner(System.in);
        System.out.println("input a integer");
        int ger = square.nextInt();

        if(ger<10) {
            System.out.println(ger * ger);
        }else if(ger>10) {
                System.out.println(ger * 2);
            } else {
                System.out.println(ger);
            }
        //
       // TERNARY VERSION
        Scanner squar = new Scanner(System.in);
        System.out.println("input a integer");
        int der = square.nextInt();

        System.out.println( der<10 ? der*der: der>10 ? der*2 : der);
    }
}
