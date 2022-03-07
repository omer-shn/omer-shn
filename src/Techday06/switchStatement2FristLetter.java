package Techday06;

import java.util.Scanner;

public class switchStatement2FristLetter {
    public static void main(String[] args) {

        Scanner inputLetter = new Scanner(System.in);
        System.out.println("choose a option");
        String opt= inputLetter.nextLine();


        switch (opt) {

            case "A":
                System.out.println("first letter"); // first letter
                break;
            case "B":
                System.out.println("second letter"); // second letter third letter >>because no break
            case "C":
                System.out.println("third letter");  //third letter
                break;
            case "D":
                System.out.println("fourt letter"); // fourt letter and down expression
            default:
                System.out.println("whit kind of letter İs this"); // other letters or numbwers gets thhis expression
        }
    }
}
