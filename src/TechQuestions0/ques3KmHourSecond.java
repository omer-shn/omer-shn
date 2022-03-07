package TechQuestions0;

import java.util.Scanner;

public class ques3KmHourSecond {
    public static void main(String[] args) {

        //KILOMETERS -MIL
        //Type a program which converts the mile to kilometer. Mile value will be entered by user. (Use double)
        //Hint 1: km = mile x 1.6
        //Hint 2: To get double, use nextDouble()

        Scanner mil =new Scanner(System.in);
        System.out.println("enter distance");
        double km =mil.nextDouble();
        System.out.println("The distance :"+km*1.6);


    // HOUR-SECOND
        //Type a program which converts the hours to seconds. Hours value will be entered by user. (Use long)
        //Hint 1: second = hour x 60 x 60 Hint 2: To get long, use nextLong()

        Scanner hour =new Scanner(System.in);
        System.out.println("Enter the hour");
        long ho= hour.nextLong();
        System.out.println("Second's total :"+ho*60*60);

    }
}
