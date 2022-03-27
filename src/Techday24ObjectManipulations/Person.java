package Techday24ObjectManipulations;

public class Person {


    public String name;
    public String lastname;
    private int id;
    private int age;
    private double salary;

    public Person () {
    }
    public Person(String name, String lastname) {
        this.name =name;
        this.lastname=lastname;


    }
    public Person(String name,String lastname, int age) {
        this.name =name;
        this.lastname=lastname;
        this.age=age;

    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); //null becasuse non parametreses
        System.out.println(person.lastname);//null becasuse non parametreses

        Person person1 = new Person("Orcun","Kadi");
        System.out.println(person1.name);
        System.out.println(person1.lastname);

        Person person2 =new Person("Adem","Yeni",24);
        System.out.println(person2.name+" "+person2.lastname+" "+person2.age);


    }

}
