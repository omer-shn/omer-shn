package Classes;

import java.util.Scanner;

public class As6 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sca.nextInt();

        try {
            if (age < 0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("your age :"+age);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e); //it is not must
            System.out.println("Age can not be small zero");
        }
    }
}
