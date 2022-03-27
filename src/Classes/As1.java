package Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class As1 {

    public static void main(String[] args) {


        int num = 0;
        int sum = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        try {
            while(count <1000) {
                System.out.println("input a number to add (to exit press a letter)");
                num = sc.nextInt();
                sum += num;
                count++;
            }

            }catch (InputMismatchException e) {
            System.out.println("Sum :"+ sum);

        }

    }
}
