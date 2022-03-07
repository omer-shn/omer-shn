package TechQuestions2;

import java.util.Scanner;

public class ques4DoWhileLoop {

    public static void main(String[] args) {

        //5)	Ask user to enter a number.
        //If the number is divisible by 10 then print "Won!" on the console otherwise ask user to enter another number.
        //Use do-while loop.


        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Enter a number");
            n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("w0n!!!");
                break;

            }
        }
        while (true);
    }
}
