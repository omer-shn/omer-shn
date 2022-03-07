package TechPractice;

import java.util.Scanner;

public class prac11CheckCONTAINS {
    public static void main(String[] args) {

        Scanner check = new Scanner(System.in);
        System.out.println("input a string");
        String chch= check.nextLine();

        String tochec= "tas"; // Looks for this word
       int ck= chch.indexOf(tochec); // to convert the integer
        if(ck==-1) {  // even one char is  missing
            System.out.println("The character dos not exist");
        } else {
            System.out.println("The character is exist");
        }

            // SECOND WAY
            if(chch.contains("tas")) {
                System.out.println("exst");
            } else {
                System.out.println("miss");
        }

                // THIRD WAY
            boolean isContain = chch.contains("tas");
            if(isContain){
                System.out.println("The char exists");
            }else{
                System.out.println("The char doesn't exist");
            }

        }
 }
