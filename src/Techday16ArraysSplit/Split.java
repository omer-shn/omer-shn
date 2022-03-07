package Techday16ArraysSplit;

import java.util.ArrayList;
import java.util.Arrays;

public class Split {

    public static void main(String[] args) {


        String words = "I go to school";
        String[] arrWords = words.split(" ");
        System.out.println(Arrays.toString(arrWords));

        String words2 ="I,go,to,school";
        String [] arrwords2 =words2.split(",");
        System.out.println(Arrays.toString(arrwords2));

        String words3 ="Muhammed#Enes#Talha#Emre#Osman";
        String [] arrwords3= words3.split("#");
        System.out.println(Arrays.toString(arrwords3));

        String words4 ="i have 2 computers and 1 bycyle";
        String [] arrwords4 =words4.split("and");
        System.out.println(Arrays.toString(arrwords4));

        String words5 ="I will be fine";;
        String [] arrwords5  =words5.split("");
        System.out.println(Arrays.toString(arrwords5));


    }
}