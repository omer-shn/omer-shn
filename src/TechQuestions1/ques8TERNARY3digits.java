package TechQuestions1;

import java.util.Scanner;

public class ques8TERNARY3digits {
    public static void main(String[] args) {
        
    //6)	Ask user to enter an integer. If the number has 3 digits, output will be
        //“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
        //How can you decide the number of digits of an integer?    

        Scanner tredig =new Scanner(System.in);
        System.out.println("Enter the number");
        int tre = tredig.nextInt();

        System.out.println( Integer.MAX_VALUE  ==3 ? "the number has 3 digits" : "the number has not 3 digits" );


                //
        Scanner dig =new Scanner(System.in);
        System.out.println("Enter the figure");
        int seven = dig.nextInt();
        System.out.println( Integer.MAX_VALUE  ==7 ? "the number has 7 digits" : "the number has not 7 digits" );
    }
}
