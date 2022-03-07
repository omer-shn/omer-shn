package TechQuestions1;

import java.util.Scanner;

public class ques16ValidPassword {
    public static void main(String[] args) {


        /*Ask user to enter password, if the password is okay for the following conditions output will be
      “Your password is created successfully.” If the password is not okay for any of the following conditions
      Output will be “Enter a new password according to the give conditions”
      First letter must be uppercase */


        Scanner password = new Scanner(System.in);
        System.out.println("Create password");
        String vpass = password.nextLine();

        char fch = vpass.charAt(0);
        char lastt= vpass.charAt(vpass.length()-1);
        String repass = vpass.replaceAll("[^ ]", "*"); //Everything changes to *
        System.out.println("Your password is :" + fch + repass + lastt);

        //also gets last character such
        //   String lastch =vpass.substring(vpass.length()-1,vpass.length());
        //   System.out.println(lastch);

        /*String str="A12345678B";
        char first = str.charAt(0);
        char second = str.charAt(str.length()-1);
        if(Character.isUpperCase(first)&& Character.isUpperCase(second)){
            //do something
        */

        if (fch >= 'A' && fch <= 'Z') {
            if (Character.isUpperCase(lastt)) {
                System.out.println("Your password is created succesfully");
            } }else {
                System.out.println("First Or Last character must be Uppercase");
            }




    }
}
