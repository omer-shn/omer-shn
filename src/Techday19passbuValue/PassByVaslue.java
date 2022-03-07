package Techday19passbuValue;

public class PassByVaslue {

/* When you use a variabble inside a method, Java creates a copy of the variable and use the copy inside the method
    Because java wants to protect original value of the variable. This process is called "Pass by Value" in Java
    Java uses "Pass by Value" evetrytime.
    The opposite of "Pass by Value" is "Pass by Reference" ,java doesnt use "Pass by Reference".
    The programming languages use pass ny reference doent protect the original value.
 */
public static void main(String[] args) {


        int shirt = 100;
        int veteranShirt = veteransDiscount(shirt);
        System.out.println(veteranShirt);

        int seniorShirt = seniorsDiscount(shirt);
        System.out.println(seniorShirt);

        int studentsShirt = studentsDiscount(shirt);
    System.out.println(studentsShirt);
    System.out.println(shirt);

    }
        // main metho is static, everything you see in main method must be static
    public static int veteransDiscount(int shirt) {
        return shirt - 20;
    }

    public static int seniorsDiscount(int shirt) {
        return shirt - 10;
    }

    public static int studentsDiscount(int shirt) {
        return shirt - 5;
    }
}
