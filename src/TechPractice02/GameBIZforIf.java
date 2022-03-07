package TechPractice02;

import java.util.Scanner;

public class GameBIZforIf {
    public static void main(String[] args) {


        Scanner biz = new Scanner(System.in);
        System.out.println("İnput an number max 100");
        int num= biz.nextInt();

        for (int jv=1;jv<=num;jv++) {
            if (jv%3==0 && jv%5==0) {
                System.out.print(" " + "java Guzeldir");
            }
            else if(jv%3==0) {
                System.out.print(" "+"java");

            } else if(jv%5==0) {
                System.out.print(" "+"Guzeldir");

            }else {
                System.out.print(" "+jv);
            }
        }
    }

}
