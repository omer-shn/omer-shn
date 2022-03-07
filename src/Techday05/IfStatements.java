package Techday05;

import java.util.Scanner;

public class IfStatements<quan> {
    public static void main(String[] args) {


  /*      Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        if(age<=4) {
            System.out.println("baby");
        }
        else if(age>=5 && age<=12 ) {
            System.out.println("child");
        }
        else if(age>=13 && age <=20) {
            System.out.println("teenager");
        }
       else  if(age>=21 && age <=30) {
            System.out.println("adult");
        } else {
            System.out.println("not excepted age");
        }
*/
       double db= 100.235;
       int xd =(int) db;
        System.out.println(xd);

        int er = 9;
        double dt = er;
        System.out.println(dt);

        System.out.println(1+'A'+"A");
        System.out.println(1+"A"+'A');

      //  boolean isTrue = 12 <= 13;

        boolean isTrue = 12 >= 13;
        System.out.println(isTrue);

        /*
        Scanner def =new Scanner(System.in);
        System.out.println("enter first side");
        int sd1= def.nextInt();
        System.out.println("enter second side");
        int sd2 =def.nextInt();
        System.out.println("area :"+sd1*sd2);
        System.out.println("perimeter :"+2*(sd1+sd2));

        if (sd1==sd2) {
            System.out.println("This form square");
        }else {
            System.out.println("it is not square");
        }
        */

        /*        // New Example
        Scanner ret = new Scanner(System.in);

        System.out.println("Enter your age");
        byte age= ret.nextByte();
        ret.nextLine();
        System.out.println("Enter your gender");
        String gen =ret.nextLine();

        if (age>=65 && gen.equalsIgnoreCase("male")) {
            System.out.println("Hey man you retired");
        }  else {
            System.out.println("no need work");
        }
*/
        // New Example
    String pass= "JavaLearner";


        if( pass.equals("JavaLearner")) {
            System.out.println("The password is true");
        }else {
            System.out.println("The password is false");
        }
            // New Example

        Scanner abs =new Scanner(System.in);

        System.out.println("Enter a number");
        double num = abs.nextDouble();

        if (num>=0) {
            System.out.println(num);
        } else {
            System.out.println(num*(-1));
        }

        Scanner price = new Scanner(System.in);

        System.out.println("What is the price");
       int di = price.nextInt();
        System.out.println("what is the quantity");
        int quan = price.nextInt();
        int amount = di*quan;
        int net =((amount/100)*90);


        if (amount>1000) {
            System.out.println("net price :"+ net);
        } else

    {
        System.out.println("no discount");
    }



    }
}
