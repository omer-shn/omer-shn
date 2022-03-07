package TechPractice;
import java.util.Scanner;
public class prac08Switch {
    public static void main(String[] args) {


        Scanner team =new Scanner(System.in);
        System.out.println("enter a football team");
        String tm= team.nextLine().toLowerCase();

        switch (tm) {
            case "galatasaray":
                System.out.println("gs");
                break;
            case "Trabzonspor":
                System.out.println("ts");
                break;
            case "Besiktas":
                System.out.println("bjk");
                break;
            case "Fenerbahce":
                System.out.println("fb");
                break;
            default:
                System.out.println("it is not a team name");
        }













    }
}
