package Techday06;

import java.util.Scanner;

public class switchStatement1 {
    public static void main(String[] args) {

  /*
        String day = "Friday";

        switch(day) {
            case "monday": System.out.println("1");
            break;
            case "Tuesday" :System.out.println("2");
            break;
            case "Wednesday": System.out.println("3");
            break;
            case "Thusday": System.out.println("4");
            break;
            case "Friday": System.out.println("5");
            break;
            case "Saturday" :System.out.println("6");
            break;
            case "Sunday": System.out.println("7");
            break;
            default: System.out.println("it is nat a day name");
        }

   */
                // SECOND
        // Burada yazılan rakamdan sonraki tüm değerler gelir.
        // Because break is missing;
/*
        Scanner mounth = new Scanner(System.in);
        System.out.println("Enter the number");
        int numMon =mounth.nextInt();

        switch(numMon) {
            case 1:
                System.out.println("January ");
            case 2:
                System.out.println(" Februery");
            case 3:
                System.out.println("March ");
            case 4:
                System.out.println("April ");
            case 5:
                System.out.println("May ");
            case 6:
                System.out.println("June ");
            case 7:
                System.out.println("July ");
            case 8:
                System.out.println("August ");
            case 9:
                System.out.println("September ");
            case 10:
                System.out.println("October ");
            case 11:
                System.out.println("November ");
            case 12:
                System.out.println("December ");
            break;
            default:
                System.out.println("invalid month number");
                break;

        }
            //THIRD
 */
        /*
        Scanner cal = new Scanner(System.in);
        System.out.println("Enter the first number");
        double  cal1 =cal.nextDouble();

        System.out.println("Enter the second number");
        double  calc2 =cal.nextDouble();

        System.out.println("Select a operation +, -,*,/,%");
        char opera =cal.next().charAt(0);  //sadece bir charakter getirmek için aşağıdaki kod kullanılır (cal.next().charAt();)

        // CAUTION !!Switch statemenlerde method parantezleri sadece int, bayte, short, char ve String için kullanılır.

        switch (opera) {
            case'+':
                System.out.println(cal1+calc2); break;
            case'-':
                System.out.println(cal1-calc2); break;
            case'*':
                System.out.println(cal1*calc2); break;
            case'/':
                System.out.println(cal1/calc2); break;
            case'%':
                System.out.println(cal1%calc2/100); break;
            default:
                System.out.println("invalid operation for that calculator");
        }

         */
         // switc statement de büyük/küçük harf duyarlılığını kaldırmak için yazılan değerler küçük harf olur
        // ikinci olarak toLowerCase kullanılır
        Scanner coun = new Scanner(System.in);
        System.out.println("Enter country name from America,England,Germany,Turkey,India,Peru,Spain,Bulgaria,Albania,France");
        String land = coun.next().toLowerCase();

        switch (land) {
            case "america": System.out.println("US"); break;
            case "england": System.out.println("UK"); break;
            case "germany": System.out.println("DE"); break;
            case "turkey": System.out.println("TR"); break;
            case "india": System.out.println("IN"); break;
            case "peru": System.out.println("PE"); break;
            case "spain": System.out.println("ES"); break;
            case "bulgaria": System.out.println("BG"); break;
            case "albania": System.out.println("AL"); break;
            case "france": System.out.println("FR"); break;
            default:
                System.out.println("we dont know this country");

        }




    }
}