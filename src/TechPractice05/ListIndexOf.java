package TechPractice05;

import  java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListIndexOf {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("K");
        list.add("P");

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter =sc.nextLine().toUpperCase();

        if(list.contains(letter)) {
            list.set(list.indexOf(letter),"Got it" ); //kullanıcıdan gelen harf listede varsa bu mesaj çıkar
                                        // kullanıcıdan gelen harf listede yoksa listeye eklenir.
        }else {
            list.add(letter);
        }
        System.out.println(list);








    }
}
