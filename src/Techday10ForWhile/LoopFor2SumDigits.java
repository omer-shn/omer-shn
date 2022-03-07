package Techday10ForWhile;

import java.util.Scanner;

public class LoopFor2SumDigits {
    public static void main(String[] args) {

        //To add all digits

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int p = scan.nextInt();
        String pS = String.valueOf(p);
        int sumOfUniqueDigits = 0;

        for(int i=0; i<pS.length(); i++){
            char c = pS.charAt(i);

            if(pS.indexOf(c)==pS.lastIndexOf(c)){
                sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(c + "");//If you put char inside the valueOf() you will get ASCII value
            }
        }
        System.out.println(sumOfUniqueDigits);



    }
}
