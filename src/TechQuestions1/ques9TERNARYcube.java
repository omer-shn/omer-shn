package TechQuestions1;

import java.util.Scanner;

public class ques9TERNARYcube {
    public static void main(String[] args) {

    //Ask user ta enter a number. If the number is less than 10 and greater than or equal to 0,
        // calculate its cube. Otherwise, calculate its square.
        //Cube of a = a*a*a	Square of a = a*a

        Scanner cube = new Scanner(System.in);
        System.out.println("enter a number");
        int cubes = cube.nextInt();

        System.out.println(cubes>=0 && cubes <=10 ? cubes*cubes*cubes : cubes*cubes);

    }
}
