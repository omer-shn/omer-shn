package TechPractice03;
import java.util.Scanner;

public class BreakCorrectPasswoed {

    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the password :");
            String pass = scanner.next();

            if (pass.equals("assetno11")) {
                System.out.println("You are in your room!!!!");
                break;
            }
          else {
                System.out.println("This password is incorrect!!!\n");
            }
        }
    }
}