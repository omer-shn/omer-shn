package TechPractice02;

import java.util.Scanner;

public class NameSurnameAppear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name");
        String name = sc.nextLine();
        System.out.println("input your lastname");
        String surname = sc.nextLine();
        System.out.println("Will yuor info appear? Y/N");
        String open = sc.nextLine().toLowerCase();


        if (open.equals("y")) {
            System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() +" "+  surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase());

        } else if (open.equals("n")) {
            System.out.println(name.replaceAll("\\w", "*") +" "+surname.replaceAll("\\w", "*"));
        }else{
            System.out.println("onyl input Y or N");
        }

    }
}
