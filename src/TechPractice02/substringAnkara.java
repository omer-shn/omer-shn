package TechPractice02;

import java.util.Scanner;

public class substringAnkara {

    public static void main(String[] args) {

              /*
Write a Java program to take the last LoopForROCKSTAR characters
from a given string and add these LoopForROCKSTAR characters
 at both the front and back of the string.
String length must be at least LoopForROCKSTAR and more.
INPUT      : Ankara
   OUTPUT  : araAnkaraara
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string..");
        String str = scan.nextLine().trim();

        if(str.length()>2){
            System.out.println(str.substring(str.length()-3) + str + str.substring(str.length()-3));
        } else {
            System.out.println("Please enter a string which has at least 3 character");
        }





    }
}
