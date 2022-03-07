package TechQuestions1;

import java.util.Scanner;

public class ques4TERNARYminNumber {
    public static void main(String[] args) {

        //Type java code by using ternary and if-else. Ask user to enter two integers
        // Write a program to print the minimum one on the console.


        Scanner codex = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int code = codex.nextInt();
        int code1= codex.nextInt();

        System.out.println (code == code1 ? "numbers are equal" : code < code1? code : code1);


   //     System.out.println( a == b     ?      "They are equal "       :    a > b ?    a   :  b );

    }
}
