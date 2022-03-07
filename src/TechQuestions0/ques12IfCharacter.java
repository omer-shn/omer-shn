package TechQuestions0;

import java.util.Scanner;

public class ques12IfCharacter {
    public static void main(String[] args) {

   //	Ask user to enter a character, then check whether the character is alphabet or not

        Scanner alpha =new Scanner(System.in);
        System.out.println("Enter a character");
        String ch=alpha.next();

        if(ch.charAt(0)>='A' && ch.charAt(0)<='Z') {
            System.out.println("this is a letter");
        } else  if (ch.charAt(0)>='a'&& ch.charAt(0)<='z'){
            System.out.println("this is a letter");
        }  else {
            System.out.println("this is not a letter");
        }

        //  SECOND WAY

        Scanner alph =new Scanner(System.in);
        System.out.println("Enter a character");
        String cha=alpha.next();

        if(cha.charAt(0)>='A' && ch.charAt(0)<='Z' || ch.charAt(0)>='a'&& ch.charAt(0)<='z'){
            System.out.println("this is a letter");
        }  else {
            System.out.println("this is not a letter");
        }
    }
}
