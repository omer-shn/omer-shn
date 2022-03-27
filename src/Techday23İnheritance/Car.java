package Techday23İnheritance;

public class Car extends Motorized{

    public Car (String make){

        super(16);

        System.out.println("Car cons. with String parameter");

    }
    public Car(int price){

        super(20);

        System.out.println("Car cons. with int parameter");
    }
}


