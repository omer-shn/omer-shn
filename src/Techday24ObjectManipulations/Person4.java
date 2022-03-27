package Techday24ObjectManipulations;

import java.util.ArrayList;
import java.util.List;

public class Person4 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Fuat", "koca");
        Person person2 = new Person("Cagri", "selcuk");
        Person person3 = new Person("Cigdem", "bakar");
        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.size());

        // 1.way
        //   for(Person person : people) {
        //      System.out.println(person.name);
        //     System.out.println(person.lastname);

        //2.way
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).name);
            System.out.println(people.get(i).lastname);

        }
        generateEmail(people);

    }

    public static void generateEmail(List<Person>people) {

        System.out.println("email1: "+people.get(0).name+people.get(0).lastname+"@gmail.com");
        System.out.println("email2: "+people.get(1).name+people.get(1).lastname+"@gmail.com");
        System.out.println("email3: "+people.get(2).name+people.get(2).lastname+"@gmail.com");
            //3.way
     //   for(Person eachPerson : people) {
       //     System.out.println(eachPerson.name+eachPerson.lastname+"@gmail.com");
        }
    }



