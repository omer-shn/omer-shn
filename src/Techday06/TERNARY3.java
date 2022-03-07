package Techday06;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class TERNARY3 {

    public static void main(String[] args) {

        Scanner nums =new Scanner(System.in);
        System.out.println("input a number");
      int y= nums.nextInt();

        int x =(y>5) ? (y<10? 2+y : 3*y) : (y>10 ? 2*7: 3+y);
        System.out.println(x);
    }
}
