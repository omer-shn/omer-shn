package TechQuestions0;

import java.util.Scanner;

public class ques7Swwap {
    public static void main(String[] args) {

        //Ask user to enter two integer values. Write a Java Program to swap
        // two numbers by using the third variable.

        Scanner swap= new Scanner(System.in);
        System.out.println("enter a number");
        int sw= swap.nextInt();
        System.out.println("enter another number");
        int swp= swap.nextInt();
        int newsp;
        newsp=sw;
        sw=swp;
        swp=newsp;
        System.out.println(sw);
        System.out.println(swp);



    }
}
