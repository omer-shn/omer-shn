package TechPractice;
import java.util.Scanner;
public class prac01IfSalaryService {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year of the service");
        int year = scan.nextInt();
        System.out.println("Enter your salary..");
        int salary = scan.nextInt();
        if(  year < 0  || salary <0  ){
            System.out.println("Please enter valid datas..");
        } else if (  year >= 0  &&  year <5  ){
            System.out.println("You should work :" + (5-year)  + "year(s)..." );
        } else {
            System.out.println("Your bonus is: "  + salary*5/100);
        }


    }
}
