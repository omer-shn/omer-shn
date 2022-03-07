package TechQuestions2;

import java.util.Scanner;

public class ques5DoWhileLoop {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int n;

        do {
        System.out.println("Enter a number");
        n = sc.nextInt();
        if (n % 10 == 0) {
            System.out.println("w0n!!!");
            break;

        }
    }
        while (true);
}
}