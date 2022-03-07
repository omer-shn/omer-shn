package TechQuestions0;

import java.util.Scanner;

public class ques17IfElsePozNeg {
    public static void main(String[] args) {

        //1)	Type java code by using if-else if() statement,
        //if both of the two integers are positive, output will be the sum of them.
        //If both of the two integers are negative, output will be the multiplication of them.
        // Otherwise; output will be “I cannot add or multiply diﬀerent signed numbers”

        Scanner poz= new Scanner(System.in);
        System.out.println("enter first number");
        int fnm= poz.nextInt();
        System.out.println("Enter second number");
        int snm= poz.nextInt();

        if(fnm>=0 && snm >=0) {
            System.out.println(fnm+snm);
        } else if (fnm<0 && snm<0) {
            System.out.println(fnm*snm);
        }else {
            System.out.println("i can not add or multiply different signed numbers");
        }
    }
}
