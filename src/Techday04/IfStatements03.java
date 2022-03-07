package Techday04;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {

        int pass = 22;
        int pass2 = 333;

        Scanner pos = new Scanner(System.in);
        System.out.println("input password");
        int input = pos.nextInt();

        if (input == pass) {
            System.out.println("you are in second step");

            int input2 = pos.nextInt();

            if (input2 == pass2) {
                System.out.println("welcome to the your page");
            } else {
                System.out.println("second step not correct");
            }
        }else{
            System.out.println("first step not correct");
        }

    }

}


