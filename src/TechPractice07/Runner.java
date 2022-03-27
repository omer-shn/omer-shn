package TechPractice07;

public class Runner {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        System.out.println("Circle Radius: " + circle1.getRadius());
        System.out.println("Circle Area: " + circle1.getArea());
        Circle circle2 = new Circle(-5);
        System.out.println("Circle Radius: " + circle2.getRadius());
        System.out.println("Circle Area: " + circle2.getArea());

    }
}
