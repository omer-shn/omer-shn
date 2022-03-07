package Techday10ForWhile;

import java.util.Scanner;

public class LoopForNested {
    public static void main(String[] args) {

                //Hello1  Hello2  Hello3  Hello4
        for(int i=1; i<5;i++) {
            for (int k =1; k<4;k++) {
                System.out.println("Hello"+ i);
            }
        }

        // Week 1  >> Day1 Day2 Day3

        for (int id=1; id<4; id++) {
            System.out.println("Week :"+ id);

            for (int ke=1; ke<4; ke++) {
                System.out.println("Day :"+ke);
            }
        }

        //Get the number of rows and colums from user

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        for(int ix=1; ix<rows+1; ix++) {

            for(int key =1; key<columns+1; key++) {
                System.out.print("*");

            }

            System.out.println();
        }
            int numrows =5;
        for( int iz=1; iz<numrows+1; iz++) {

            for (int kl =1; kl<=iz; kl++) {
                System.out.print(kl);

            }
            System.out.println();

        }

















    }
}
