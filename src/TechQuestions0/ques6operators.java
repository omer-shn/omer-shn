package TechQuestions0;

import java.util.Scanner;

public class ques6operators {
    public static void main(String[] args) {

        //Type a program like;
        //Ask user to enter two integer values, the first will be greater than the second. The remainder when you divide the first by the second will be the width,
        //and the sum of the two numbers will be the length of a rectangle.
        //Then calculate the area and the perimeter of the rectangle, and print them on the console.

        Scanner rect = new Scanner(System.in);
        System.out.println("Enter big number");
        int cal= rect.nextInt();
        System.out.println("Enter small number");
        int call= rect.nextInt();
        int wi =cal%call;
        int le= cal+call;
        int ar=wi*le;
        int per=2*(wi+le);

        System.out.println("width :"+wi);
        System.out.println("length :"+le);
        System.out.println("area :"+ar);
        System.out.println("perimeter :"+per);

    }
}
