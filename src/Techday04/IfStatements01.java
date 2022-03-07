package Techday04;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {


            /*
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter an integer to check its positivity");
        int num= scan.nextInt();

        if(num>0) {
            System.out.println("positive");
        }  if (num<0) {
            System.out.println("negative");
        } if  (num==0){
            System.out.println("neuter");
        }

             */

        // SECOND EXAMPLE--TEK Mİ ÇİFT Mİ (ODD OR EVEN)

       /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is even or odd");
        int nom = scan.nextInt();

        if(nom% 2==0) {
            System.out.println("Even");
        } if (nom%2!=0) {
            System.out.println("Odd");
        }

        */

           //  THIRD EXAMPLES

      /* Scanner scan = new Scanner(System.in);

        System.out.println("Enter a day name");
        String day = scan.nextLine();

        if(day.equals("Monday")) {
            System.out.println("Weekday");
        }
        if(day.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if(day.equals("Wednesday")) {
            System.out.println("Weekday");
        }
        if(day.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if(day.equals("Friday")) {
            System.out.println("Weekday");
        }
        if(day.equals("Saturday")) {
            System.out.println("Weekend");
        }
        if(day.equals("Sunday")) {
            System.out.println("Weekend");
        }

       */
                    // FOURTH EXAMPELS

        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a day name");
        String day = scan.nextLine();
            // CAUTION!!büyük/küçük harf duyarlılığını kaldırmak için, equals yerine >>> equalsIgnoreCase <<< kullanılır.

        if ((day.equals("Monday")) || (day.equals("Tuesday")) || (day.equals("Wednesday")) ||
                (day.equals("Thursday")) ||(day.equals("Friday"))) {
            System.out.println("weekday");
        }
       else if ((day.equals("Saturday")) || (day.equals("Sunday"))) {
            System.out.println("weekend");
        } else {
            System.out.println("This is not a day name");
        }
 */
                // FIFTH EXAMPLES

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a day name");
        String day = scan.nextLine();
        // CAUTION!!büyük/küçük harf duyarlılığını kaldırmak için, equals yerine >>> equalsIgnoreCase <<< kullanılır.

        boolean isWeekday = day.equalsIgnoreCase("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") || day.equals("Friday");


        boolean isWeekendDay=  day.equals("Saturday") || day.equals("Sunday");


          if(isWeekday) { System.out.println("weekday");
        }
          else if (isWeekendDay) {
              System.out.println("weekend");
          } else {
              System.out.println("This is not a day name");
          }


    }
}
