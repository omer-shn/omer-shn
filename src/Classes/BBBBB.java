package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static TechPractice05.Anagram.isAnagram;


public class BBBBB {

    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first String..");
            String first = sc.nextLine();
            System.out.println("Enter the second String..");
            String second = sc.nextLine();
           System.out.println(isAnagram(first,second));


        }

   public static String angm(String st1, String st2) {
        String s1 []=st1.toLowerCase().replaceAll(" ","").split("");
        String s2 []=st2.toLowerCase().replaceAll(" ","").split("");
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)) {
            return "Anagram";
        }else {
            return "Not anagram";
        }
   }









}
