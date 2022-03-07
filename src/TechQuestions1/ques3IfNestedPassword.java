package TechQuestions1;

import java.util.Scanner;

public class ques3IfNestedPassword {
    public static void main(String[] args) {

        /*Type java code by using nested if() statement.
3)	Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; Ali ==> Valid password	-	ali ==> Invalid	-	Mark ==> Invalid

If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; zoe ==> Valid password	-	Zoe ==> Invalid	-	john ==> Invalid  */

        Scanner pass = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = pass.nextLine();

        char firstChar = pwd.charAt(0);

        if (firstChar >= 'A' && firstChar <= 'Z') {
            if (firstChar == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else if (firstChar >= 'a' && firstChar <= 'z') {
            if (firstChar == 'z') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid password because first character must be letter");
        }
    }
}



