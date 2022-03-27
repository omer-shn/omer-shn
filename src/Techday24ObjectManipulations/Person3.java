package Techday24ObjectManipulations;

import java.util.Scanner;

public class Person3 {


    public static void main(String[] args) {


        Scanner scsn = new Scanner(System.in);

        System.out.println("please type your last and lastname");
        Person person =new Person(scsn.nextLine(), scsn.nextLine());

        generateEmail(person);

    }
    public static void generateEmail(Person person) {
        System.out.println(person.name+person.lastname+"gmail.com");

    }
}
