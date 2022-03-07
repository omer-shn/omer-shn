package TechQuestions0;

import java.util.Scanner;

public class ques13IfCharacterVALUEoF {
    public static void main(String[] args) {

        //Ask user ta enter any name of the week, then get second ,fourth, and sixth letter of the day name
        // and print them on the console, in the same line.
        //For example; if the user enters “Monday” output will be “ody”

        Scanner week =new Scanner(System.in);
        System.out.println("enter a day");
        String day = week.nextLine();

        String a= String.valueOf(day.charAt(1));
        String b= String.valueOf(day.charAt(3));
        String c= String.valueOf(day.charAt(5));
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);




        // PAGE 62  3.QUESTION COMES HERE



    }
}
