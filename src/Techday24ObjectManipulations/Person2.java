package Techday24ObjectManipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> lastnames =new ArrayList<>();


        Scanner s =new Scanner(System.in);

        System.out.println("Type 2 names");
        names.add(s.nextLine());
        names.add(s.nextLine());
        System.out.println("Type 2 lastnames");
        lastnames.add(s.nextLine());
        lastnames.add(s.nextLine());

        System.out.println("user names :"+names);
        System.out.println("user lastnames :"+lastnames);
        System.out.println("user email :"+ getEmail(names,lastnames));


    }
    public static List<String> getEmail(List<String>names, List<String>lastnames) {
        List<String> emails =new ArrayList<>();
        for(int i=0;i<names.size();i++) {
            emails.add(names.get(i) + lastnames.get(i) + "gmail.com");
        }
        return emails;


        }

    }


