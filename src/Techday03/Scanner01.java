package Techday03;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

      /*  Scanner scan =new Scanner(System.in);

        System.out.println("Enter your age");
        int ag= scan.nextInt();
        System.out.println("your age is :"+ag); */

       /* Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String fn = scan.nextLine();
        System.out.println("welcome!"+fn);

       */

       /* Scanner scan = new Scanner(System.in);
        System.out.println("How much this t-short");
        double ts = scan.nextDouble();
        System.out.println("T-shirt price is :"+ts);

 */
     /*   Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sides( width & lenght)");
        int fs = scan.nextInt();
        int ss= scan.nextInt();
        System.out.println("area is :"+fs*ss);
        System.out.println("perimeter is :"+2*(fs+ss));

      */

        Scanner scan = new Scanner(System.in);

       /* String name="";

        while (name.isBlank()) {
            System.out.println("Enter your name");
            name =scan.nextLine();
        }
        System.out.println("selam "+name); */

        //

        String nome="";
        do { System.out.println("Enter your name");
            nome =scan.nextLine(); }
        while (nome.isBlank());
        System.out.println("selam "+nome);







    }
}
