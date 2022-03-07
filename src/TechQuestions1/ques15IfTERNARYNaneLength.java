package TechQuestions1;

import java.util.Scanner;

public class ques15IfTERNARYNaneLength {
    public static void main(String[] args) {

//4)	Ask user ta enter his/her first and last name. If the first name is longer output will be “First name is longer.”
// If the length of last name is equal To the length of last name output will be “First name and last name have same length.”
// Otherwise, output will be “Last name is longer”

        Scanner namelength = new Scanner(System.in);
        System.out.println("enter your name");
        String nam = namelength.nextLine().toLowerCase();
        System.out.println("enter your surname");
        String snam= namelength.nextLine().toLowerCase();

        if(nam.length()==snam.length()) {
            System.out.println("first name and surname have same length");
        }
            else if(nam.length()>snam.length()) {
            System.out.println("First name is longer");
        }
            else {
                System.out.println("Surname is longer");
            }

            //  TERNARY VERSION
        Scanner namlength = new Scanner(System.in);
        System.out.println("enter your name");
        String namm = namelength.nextLine().toLowerCase();
        System.out.println("enter your surname");
        String snamm= namelength.nextLine().toLowerCase();

        System.out.println( (namm.length()==snamm.length()) ? "first name and surname have same length" : (namm.length()>snamm.length()) ? "First name is longer" : "Surname is longer");

    }

}
