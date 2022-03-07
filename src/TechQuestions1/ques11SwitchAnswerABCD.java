package TechQuestions1;

import java.util.Scanner;

public class ques11SwitchAnswerABCD {
    public static void main(String[] args) {

        //Write a Java program user will choose answer among A, B, C, or D.
        //If the answer is true, output will be “True.” If the answer is false, output will be “False”.
        // Correct answer is ‘C’ for the multiple option question.

        Scanner answer = new Scanner(System.in);
        System.out.println("sign an option : A,B,C,D");
        String ans= answer.nextLine().toUpperCase();

        switch (ans) {
            case "A":
                System.out.println("False");
                break;
            case "B":
                System.out.println("False");
                break;
            case "C":
                System.out.println("True");
                break;
            case "D":
                System.out.println("False");
                break;
            default:
                System.out.println("invalid option");
        }

        //Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
        //Then type a program by using “switch statement” to print “United” for ‘U’ ”States” for ’S’, and “America” for ‘A’

        Scanner abbrev = new Scanner(System.in);
        System.out.println("sign an option : U,S,A");
        String abb= answer.nextLine().toUpperCase();

        switch (abb) {
            case "U":
                System.out.println("United");
                break;
            case "S":
                System.out.println("States");
                break;
            case "A":
                System.out.println("America");
                break;
            default:
                System.out.println("invalid letter");
        }
    }
}
