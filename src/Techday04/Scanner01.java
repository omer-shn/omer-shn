package Techday04;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

   /*     Scanner  scan =new Scanner(System.in);

        System.out.println("Enter the width");
        double width = scan.nextDouble();
        System.out.println("Enter the length");
        double length = scan.nextDouble();
        System.out.println("Enter the height");
        double height = scan.nextDouble();

        System.out.println("The volume of rectangular prism is: "+ width*length*height);

    */
        // Second Example
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String fname = scan.nextLine();
        System.out.println("Enter your middle name");
        String middle= scan.nextLine();
        System.out.println("Enter your lastname");
        String lname= scan.nextLine();
        System.out.println("Enter your SSN ID");
        String ssn=scan.nextLine();

        System.out.println(fname+" "+middle+" "+lname);
        System.out.println("Your ID :"+ssn);






    }
}
