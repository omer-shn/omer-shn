package TechQuestions0;

import java.util.Scanner;

public class ques16FourDigitSum {
    public static void main(String[] args) {

     //Ask user ta enter a 4 digits integer, then print the sum of the first and the last digit of the number on console.
        //For example; if user enters 1234 you will add 1 and 4, then print on the console 5

        Scanner digit =new Scanner(System.in);

        System.out.println("Enter a number 4 digits");
        int dig= digit.nextInt();

        // For Add all digtis
        //        Scanner input = new Scanner(System.in);
        //        System.out.println("Lütfen bir tammsayı yazın");
        //
        //        int sayi = input.nextInt();
        //        int toplam = 0;
        //
        //        while (sayi != 0) {
        //            toplam += sayi % 10; //sağdaki basamağı toplama ekle
        //            sayi=sayi/10; //sağdaki basamağı sil
        //        }
        //        System.out.println("Yazdığınız sayının basamakları toplamı="+toplam);
    }
}
