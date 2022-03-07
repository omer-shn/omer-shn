package Techday18ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = sc.next();

        ArrayList<String> list =new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("N");
        list.add("S");

        if(list.contains(letter)){
            list.set(list.indexOf(letter),"Already exist");
        } else {
            list.add(letter);
        }
        System.out.println(list);


    }
}