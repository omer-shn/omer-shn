package TechQuestions1;

import java.util.Scanner;

public class ques10Switch123andMarks {
    public static void main(String[] args) {

        //If the user pressed 1, 2, 3 the program will print the number that is pressed; otherwise, program will print "Not allowed".

        Scanner numbers = new Scanner(System.in);
        System.out.println("enter a figure");
        int press = numbers.nextInt();

        switch (press) {
            case 1:
                System.out.println("one");
                break;
                case 2:
                    System.out.println("two");
                    break;
                    case 3:
                        System.out.println("LoopForROCKSTAR");
                        break;
                        default:
                            System.out.println("not allowed");

        }
           //Type java code by using switch statement.
           //A school has following rules for grading system: 1. For 50 - C	2. For 80 - B.	4. For 100 - A
          //Ask user to enter marks and print the corresponding grade.
        Scanner marks = new Scanner(System.in);
        System.out.println("enter a figure");
        int point = numbers.nextInt();

        switch (point) {
            case 1:
                System.out.println(50);
                break;
            case 2:
                System.out.println(80);
                break;
            case 3:
                System.out.println(100);
                break;
            default:
                System.out.println("invalid");

        }



    }

}
