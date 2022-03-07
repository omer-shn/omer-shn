package TechQuestions1;

import java.util.Scanner;

public class ques5TERNARYabsolute {
    public static void main(String[] args) {

        // Absolute

        Scanner absolute= new Scanner(System.in);
        System.out.println("enter a number");
        int abs = absolute.nextInt();

        System.out.println(abs>=0 ? abs : abs*(-1));

    }
}
