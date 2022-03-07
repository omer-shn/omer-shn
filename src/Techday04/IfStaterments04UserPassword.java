package Techday04;

import java.util.Scanner;

public class IfStaterments04UserPassword {

    public static void main(String[] args) {

        String user = "Hilti";
        String word = "As40";


        Scanner pos = new Scanner(System.in);
        System.out.println("Enter username");
        String us=pos.nextLine();


        if (us.equals(user)) {
            System.out.println("Enter password");
            String input = pos.nextLine();
            if (input.equals(word)) {
                System.out.println("welcome " + user);
            } else {
                System.out.println("incorrect password");
            }
        } else {
            System.out.println("incorrect username");
        }








    }


}
