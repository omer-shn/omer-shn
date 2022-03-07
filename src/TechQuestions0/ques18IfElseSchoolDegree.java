package TechQuestions0;

import java.util.Scanner;

public class ques18IfElseSchoolDegree {
    public static void main(String[] args) {

   //3)	Type java code by using if-else if() statement.
        //A school has following rules for grading system:
        //1. Below 50 - D	2. 50 to 59 - C	3. 60 to 80 - B.	4. From 80 to 100 - A
        //Ask user to enter marks and print the corresponding grade.

        Scanner degree =new Scanner(System.in);
        System.out.println("enter your mark");
        int mark = degree.nextInt();

        if(mark<50) {
            System.out.println("D");
    }
       else if(mark>50 && mark<=59) {
            System.out.println("c");
        }
       else if(mark>=60&& mark<=79) {
            System.out.println("C");
        }
        else if(mark>=80 && mark<=100) {
            System.out.println("A");
        }else{
            System.out.println("invalid mark");
        }
    }

}
