package Educa;

import java.util.Scanner;

public class Edu03LOOPS {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

       /* String name="";

        while (name.isBlank()) {
            System.out.println("Enter your name");
            name =scan.nextLine();
        }
        System.out.println("selam "+name); */

        /*

        String nome="";
        do { System.out.println("Enter your name");
            nome =scan.nextLine(); }
        while (nome.isBlank());
        System.out.println("selam "+nome);

        */

      /*  for (int i=10; i>=0;i--) {
            System.out.println(i);
        }
        System.out.println("Happy days!");
            //

        for (int i=0; i<=6;i+=2) {
            System.out.println("Selamlar"); }

       */

        int rows;
        int columns;
        String symbol="";
        System.out.println("Enter of rows");
        rows =scan.nextInt();
        System.out.println("Enter of columns");
        columns= scan.nextInt();
        System.out.println("Enter of symbol");
        symbol= scan.next();

        for(int r=1; r<=rows; r++) {
            System.out.println();
            for(int cl=1; cl<=columns;cl++) {
                System.out.print(symbol);
                System.out.println(1);
            }

        }

            String [] animals = {"cat","birds","sheep","horse"};

            for(String i :animals) {
                System.out.println(i);
            }

    }
}
