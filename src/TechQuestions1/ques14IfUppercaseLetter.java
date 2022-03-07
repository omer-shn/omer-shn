package TechQuestions1;

import java.util.Scanner;

public class ques14IfUppercaseLetter {
    public static void main(String[] args) {

        //Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
        // If it is before “F” in alphabetical order output will be “ Big before F”,
        // otherwise output will be “Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
        //If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”

        Scanner uppercase = new Scanner(System.in);
        System.out.println("input a letter");
        String lett = uppercase.nextLine();

        char first = lett.charAt(0);
        if(first>='A' && first <='Z') {
            if (first<'F') {
                System.out.println("it is big before F ");
            } else   if (first=='F') {
                    System.out.println("it is F");
                }
             else {
                System.out.println("big after F");
            }
        }  else if (first>='a' && first<='z') {
            if (first < 'h') {
                System.out.println("it is small before h");

            } else if (first == 'h') {
                System.out.println("it is h");
            } else {
                System.out.println("small after h");
            }
        }

    }
   }
