package TechQuestions0;

import java.util.Scanner;

public class ques14IfPasswordAbsolute {
    public static void main(String[] args) {

        // 	Type java code by using if-else statement,
        //if the password is “JavaLearner”, output will be “The password is true”. Otherwise, output will be “The password is false”.

        Scanner password =new Scanner(System.in);
        System.out.println("enter your password");
        String pass= password.nextLine();

        if (pass.equals("JavaLearner")) {
            System.out.println("The password is true");
        }else {
            System.out.println("The password is false");
        }

        //	Type java code by using if-else statement,
        //Write a program to print absolute value of a number entered by user. Absolute Value: If the number is positive or zero return the number itself
        //If the number is negative return the number after multiplying by -1

        Scanner absolute =new Scanner(System.in);
        System.out.println("Enter a number");
        int abso= absolute.nextInt();

        if(abso>=0) {
            System.out.println(abso);
        }else {
            System.out.println(abso * (-1));
        }

        // Same question with TERNARY
     //   int typ= (num>0) ? (num) : (num*(-1));
     //   System.out.println(typ);

    }
}
