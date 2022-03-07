package TechQuestions0;

import java.util.Scanner;

public class ques4StringNameAdress {
    public static void main(String[] args) {

        // ENTER THE NAME
       //Type a program which asks user to enter his/her first name and last name, then print it on the console.
        //Hint: To get String, use nextLine()

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");
        String fn = name.nextLine();
        System.out.println("enter your lastname");
        String ln= name.nextLine();
        System.out.println("your name :"+fn+" "+ln);


        //Type a program which asks user to enter his/her full name, and address then print them on the console like the full name should be in the first line, and the address will be in the second line.
        //Hint: To get String, use nextLine()

        Scanner fullName = new Scanner(System.in);
        System.out.println("Enter your fullname");
        String full= fullName.nextLine();
        System.out.println("Enter your adress");
        String add=fullName.nextLine();
        System.out.println(full);
        System.out.println(add);



    }
}
