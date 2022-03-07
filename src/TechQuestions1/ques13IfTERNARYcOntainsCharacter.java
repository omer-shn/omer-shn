package TechQuestions1;

import java.util.Scanner;

public class ques13IfTERNARYcOntainsCharacter {
    public static void main(String[] args) {

       /*2)	Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.
       ” if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
       “This name contains neither ‘a’ nor ‘z’.”
        */

        Scanner firstletter = new Scanner(System.in);
        System.out.println("enter kid's name");
        String kid=firstletter.nextLine().toLowerCase();

        if(kid.contains("a") && kid.contains("z")) {
            System.out.println("the name contains both 'a' and 'z'");
        } else if (kid.contains("a")) {
            System.out.println("the name contains a");
        } else if (kid.contains("z")) {
            System.out.println("the name contains z");
        }   else{
            System.out.println("the name contains neither a nor z");
        }

        // TERNARY VERSION
        Scanner firstlet = new Scanner(System.in);
        System.out.println("enter kid's name");
        String kids=firstletter.nextLine().toLowerCase();

        System.out.println(   kids.contains("a") && kids.contains("z") ? "the name contains both 'a' and 'z'" : kids.contains("a") ? "the name contains a" : kids.contains("z") ? "the name contains z": "the name contains neither a nor z");


    }
}
