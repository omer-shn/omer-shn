package Techday06;

import java.util.Scanner;

public class switcStatement4Calculation {

    public static void main(String[] args) {

        Scanner cal =new Scanner(System.in);
        System.out.println("input a number");
        double nm1 =cal.nextDouble();
        System.out.println("input second number");
        double nm2 =cal.nextDouble();
        System.out.println("choose a option +, -, *, /, % ");
        char option =cal.next().charAt(0);

        switch (option) {
            case '+':
                System.out.println(nm1+nm2); break;
            case '-':
                System.out.println(nm1-nm2); break;
            case '*':
                System.out.println(nm1*nm2); break;
            case '/':
                System.out.println(nm1/nm2); break;
            case '%':
                System.out.println(nm1*nm2/100); break;
            default:
                System.out.println("invalid option");
                break;



        }
    }
}
