package TechQuestions1;

import java.util.Scanner;

public class ques6TERNARYrectangle {
    public static void main(String[] args) {

        // Rectangle Check
        Scanner rectangle =new Scanner(System.in);
        System.out.println("enter width and lenght");
        int wi = rectangle.nextInt();
        int le = rectangle.nextInt();

        System.out.println(wi==le ? "this form is square" : "this is not square");
    }
}
