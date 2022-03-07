package Educa;

import java.util.Scanner;

public class Edu {

    public static void main(String[] args) {

    Scanner scan =new Scanner(System.in);

        System.out.println("what is your name?");
        String name =scan.nextLine();
        System.out.println("how old are you?");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("what is your favourite food?");
        String food= scan.nextLine();
        System.out.println("what is your code?");
        int code=scan.nextInt();
        scan.nextLine();
        System.out.println("where do you live?");
        String live=scan.nextLine();


        System.out.println("hello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("you like "+food);
        System.out.println("your code :"+code);
        System.out.println("your place :"+live);



    }


}
