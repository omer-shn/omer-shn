package TechQuestions1;

import java.util.Scanner;

public class ques1IfNested {
    public static void main(String[] args) {

      /*
         Ask user to enter an integer
         Type java code by using nested if statement,
         If a number is even then check if it is divisible by 3 or not.
         If it is divisible by 3 the output will be “Perfect even number”
         otherwise, the output will be “Good even number.”
         If the number is odd then check if it is divisible by 3 or not.
         If it is divisible by 3 the output will be “Perfect odd number”
         otherwise, the output will be “Good odd number.”
         erwise, the output will be “Good odd number.”

       */

        int num = 11;

        if (num % 2 == 0) {
            if (num % 3 == 0) {
                System.out.println("Perfect even number");
            } else {
                System.out.println("Good even number");
            }
        } else {
            if (num % 3 == 0) {
                System.out.println("Perfect Odd number");
            } else {
                System.out.println("Good odd number");
            }
        }


        //  TERNARY VERSION  -CAUTION!! When Both integer and String WRITE DIRECT >>> System.out.println

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int nb = scan.nextInt();


        System.out.println((nb % 2 == 0) ? (nb % 3 == 0 ? "Perfect even number" : "Good even number") : (nb % 3 == 0 ? "Perfect Odd number" : "Good odd number"));

      }
    }



