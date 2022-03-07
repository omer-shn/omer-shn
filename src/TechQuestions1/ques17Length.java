package TechQuestions1;

import java.util.Scanner;

public class ques17Length {
    public static void main(String[] args) {

        Scanner wordlength =new Scanner(System.in);
        System.out.println("enter a expression");
        String len =wordlength.nextLine();
        System.out.println(len.length());

                //SECOND WAY
        String exlength= String.valueOf(len.length());
        System.out.println(exlength);
    }
}
