package TechQuestions0;

import java.util.Scanner;

public class ques11IfAges {
    public static void main(String[] args) {

        //	Ask user to enter his/her age. If the age is between 18 and 65 then output
    // will be “You should work”, else output will be “No need to work”
        Scanner age= new Scanner(System.in);
        System.out.println("Enter your age");
        int ag =age.nextInt();

        if(ag>=18 && ag<=65) {
            System.out.println("you should work");
        }else {
            System.out.println("no need to work");
        }

       //2)	Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
        //  then output will be “Hey man you retired!” else output will be “No need to work”
        Scanner ages= new Scanner(System.in);
        System.out.println("Enter your age");
        int agg =ages.nextInt();
         ages.nextLine();
        System.out.println("enter your gender");
        String gen= ages.nextLine().toLowerCase();

        if(agg>65 && gen.equals("male")) {
            System.out.println("hey man you retired");
        }else {
            System.out.println("you should work");
        }

        //	Type java code by using if-else if() statement,
        //If age is less than 13 output will be “Should not work”,
        //If age is greater than 65 output will be “Retired”, Otherwise; output will be “Should work

        Scanner agess= new Scanner(System.in);
        System.out.println("Enter your age");
        int aggg =ages.nextInt();

        if(aggg<13) {
            System.out.println("should not work");
        }else if (aggg>65) {
            System.out.println("retired");
        }else {
            System.out.println("should work");
        }


    }
}
