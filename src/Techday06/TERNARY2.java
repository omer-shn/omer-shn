package Techday06;

import java.util.Scanner;

public class TERNARY2 {
    public static void main(String[] args) {


        Scanner letter =new Scanner(System.in);
        System.out.println("input a letter");
        String y =letter.nextLine();

        String tern=(y.charAt(0)>'a' && y.charAt(0)<'z') ? (y.charAt(0)<'f' ? "good" : "bad") : (y.charAt(0)>'K' ? "Big" : "small");
        System.out.println(tern);

        //
        System.out.println();
        int one =-9;
        int two= 2;

        System.out.println(one>0 && two > 0  ?  one*two  :  "i do not know how to multiply");



    }
}
