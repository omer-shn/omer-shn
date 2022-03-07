package TechQuestions0;

import java.util.Scanner;

public class ques1CubePrism {
    public static void main(String[] args) {

        //Type a program which calculates the area and the perimeter
        // of a square whose side length is entered by user.

        int sq1 =6;
        int sq2=6;
        System.out.println("area :"+sq1*sq2);
        System.out.println("perimeter :"+2*(sq1+sq2));

       // Type a program which calculates the cube of a number which is entered by user.
        //Hint 1: Cube of a number is a x a x a

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int cube= scan.nextInt();

        System.out.println("Cube of number :"+ cube*cube*cube);

        //Type a program which calculates the area and the perimeter of a rectangle whose length and with are entered by user.
        //Hint 1: Area of a rectangle is width x length
        //Hint 2: Perimeter of a rectangle is 2x (width + length)

        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side");
        double rec=sc.nextDouble();
        System.out.println("enter second side");
        double reg= sc.nextDouble();

        System.out.println("Area :"+rec*reg);
        System.out.println("Perimeter :"+2*(rec+reg));


        // Type a program which calculates the volume of a rectangular prism whose length, with, and height are entered by user.
        //Hint 1: Volume of a rectangular prism is width x length x height

        Scanner prism= new Scanner(System.in);
        System.out.println("enter length");
        int le = prism.nextInt();
        System.out.println("enter heigth");
        int he= prism.nextInt();
        System.out.println("enter width");
        int wi= prism.nextInt();

        System.out.println("The Prism volume :"+le*he*wi);

    }
}
