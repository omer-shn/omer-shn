package Techday24ObjectManipulations;

import java.util.Scanner;

public class Person1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter your name and lastname");
        String fn=scn.nextLine();
        String ln=scn.nextLine();
        String email ="@gmail.com";

        System.out.println(fn+ln+email); // two lines gets the same result
        System.out.println(infoemail(fn,ln)+email); // two lines gets the same result
    }
    public static String infoemail(String fnln, String email) {
        return (fnln+email).toLowerCase();
    }

}
