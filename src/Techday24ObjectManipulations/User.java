package Techday24ObjectManipulations;

import java.util.Locale;
import java.util.Scanner;

public class User {


    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name");
        String firstname = scan.nextLine().replaceAll(" ","").toLowerCase();

        System.out.println("enter your last name");
        String lastname = scan.nextLine().replaceAll(" ","").toLowerCase();
        System.out.println(getEmail(firstname,lastname));

    }
    public static String getEmail(String firstname, String lastname) {
        return firstname+lastname+"@gmail.com";
    }
}