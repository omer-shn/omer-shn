package TechQuestions1;

import java.util.Scanner;

public class ques7TERNARYstringLength {
    public static void main(String[] args) {

        //5)	Ask user to enter a String. If the String has 2 characters, output will be
        //“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”

        Scanner abbrev = new Scanner(System.in);
        System.out.println("enter your word");
        String word = abbrev.nextLine();


        System.out.println(word.length()==2 ? "it is valid for state abbreviations" : "it is not valid for state abbreviations");

    }
 }
