package TechQuestions2;

import java.util.Scanner;

public class ques6DoWhileloop {
    public static void main(String[] args) {

        Scanner wo = new Scanner(System.in);
        String name="";

        do{
            System.out.println("Enter the name");
            name=wo.nextLine();
            if(name.equals("ova")) {
                System.out.println("welcome!!");
                break;
            }
            System.out.println("it is not your name");
        }while (true);
    }
}
