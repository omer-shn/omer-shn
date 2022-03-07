package TechQuestions0;

import java.util.Scanner;

public class ques10IfRectangle {
    public static void main(String[] args) {

        Scanner rec= new Scanner(System.in);
        System.out.println("enter first side");
        double squ = rec.nextDouble();
        System.out.println("enter second side");
        double squr = rec.nextDouble();

        if(squ==squr) {
            System.out.println("this is a square");
        }
            else {
            System.out.println("this is not square");
        }

    }
 }
