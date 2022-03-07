package TechQuestions0;

import java.util.Scanner;

public class ques19IfElseLeapYear {
    public static void main(String[] args) {

   //4)	Ask user to enter year
        //Type java code by using if-else if() statement.
        //Write a program to check if a year is leap year or not.
        //if the year is divisible by 100 then it must be divisible by 400.
        // If a year is not divisible by 100 then it must be divisible by 4.

        Scanner leap =new Scanner(System.in);
        System.out.println("Enter year");
        int year = leap.nextInt();

        if(year%100==0 && year%400==0) {
            System.out.println("leap year");
        } else if (year%100==0 || year%4==0) {
                System.out.println("leap year");
            }else {
                System.out.println("not a leap year");
        }
                // TERNARY VERSION
        int tyear= 900;
        String isLeap=  (tyear%100==0)  ? (tyear%400==0 ? "Leap year!": "not Leap year" ) : (tyear%4==0 ? "Leap year!": "not Leap year");
        System.out.println(isLeap);
    }
}
