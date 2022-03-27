package Techday24ObjectManipulations;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class UserTwo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two names");
        String names = sc.nextLine().replaceAll(" ","").toLowerCase();
        String names1 = sc.nextLine().replaceAll(" ","").toLowerCase();
        System.out.println("Enter two lastname");
        String lastnames = sc.nextLine().replaceAll(" ","").toLowerCase();
        String lastnames1 = sc.nextLine().replaceAll(" ","").toLowerCase();
        System.out.println(twoPersons(names,lastnames,names1,lastnames1));
    }
    public static String twoPersons(String names, String lastnames,String names1, String lastnames1){
        return names+lastnames+"@gmail.com"+","+names1+lastnames1+"@gmail.com";
    }



}

