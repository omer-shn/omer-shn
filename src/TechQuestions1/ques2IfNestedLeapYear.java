package TechQuestions1;

import java.util.Scanner;

public class ques2IfNestedLeapYear {
    public static void main(String[] args) {

        /*Type java code by using nested if() statement.
        Write a program to check if a year is leap year or not.
       If the year is divisible by 100 then it must be divisible by 400.
       If a year is not divisible by 100 then it must be divisible by 4.
         */
        Scanner leapYear =new Scanner(System.in);
        System.out.println("Enter year");
        int yr = leapYear.nextInt();

        if(yr%100==0) {
            if(yr%400==0) {
                System.out.println("leap year");
        }else {
                System.out.println("not leap year");
            }
            }else if (yr%4==0) {
                System.out.println("leap year");
            } else{
                System.out.println("not leap year");
            }
            }

    }


