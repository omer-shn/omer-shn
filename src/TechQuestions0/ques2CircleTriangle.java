package TechQuestions0;


import java.util.Scanner;

public class ques2CircleTriangle {
    public static void main(String[] args) {

        //Type a program which calculates the area and the perimeter of a circle whose radius is entered by user. (Use float)
        //Hint 1: Take pi number as 3.14159
        //Hint 2: Area of a circle is 3.14159 x radius x radius Hint 3: Perimeter of a circle is 2 x 3.14159 x radius Hint 4: To get float, use nextFloat()

        Scanner radius = new Scanner(System.in);
        System.out.println("Enter radius");
        float crc= radius.nextFloat();

       System.out.println("circles area :"+3.14159*crc*crc);
      System.out.println("circles perimeter :"+2*3.14159*crc);

     //    Type a program which calculates the perimeter of a triangle whose Side lengths are entered by user. (Use byte)
     //   Hint 1: Perimeter of a triangle is a + b + c Hint 4: To get byte, use nextByte()

        Scanner triangle =new Scanner(System.in);
        System.out.println("Enter first side");
        byte tri1 = triangle.nextByte();
        System.out.println("enter second side");
        byte tri2 =triangle.nextByte();
        System.out.println("Enter third side");
        byte tri3 = triangle.nextByte();

        System.out.println("Triangle's perimeter :"+(tri1+tri2+tri3));

     //  Triangle area calculation


        Scanner triArea = new Scanner(System.in);
        System.out.println("Enter floor lengh");
        double floor =triArea.nextDouble();
        System.out.println("enter the heigth");
        double heigth =triArea.nextDouble();

        System.out.println("Triangle ares :"+(floor*heigth)/2);


    }
}
