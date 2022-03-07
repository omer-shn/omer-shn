package ZSpecial;

import java.util.Locale;
import java.util.Scanner;

public class AyhanBEYHAN {
    public static void main(String[] args) {


        String asd= "Ayhan BEYHAN";
        String nasd = asd.replace(asd.substring(0),"AYHAN Beyhan");
        System.out.println(nasd);

        // second way

        String asf = "Ayhan BEYHAN";
        String nasf = asf.substring(0,5).toUpperCase();
        String nass = asf.substring(7).toLowerCase();
        String nas = asf.substring(6,7);

        String con=nasf+" "+nas+nass;
        System.out.println(con);

        // For only firs letter UpperCase


        Scanner azx = new Scanner(System.in);
        System.out.println("Please type your First name and Last name:");
        String az = azx.nextLine().toUpperCase();
        String az2 = az.substring(1,az.indexOf(' ')).toLowerCase();
        String az3 = az.substring(az.indexOf(' ')+3,az.length()).toLowerCase();
        System.out.println(az.toUpperCase().charAt(0) + az2 + " " + az.toUpperCase().charAt(az.indexOf(' ')+1) + az3);






    }
}
