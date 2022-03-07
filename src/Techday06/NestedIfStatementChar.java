package Techday06;

import java.util.Scanner;

public class NestedIfStatementChar {
    public static void main(String[] args) {

/*
        Ask user to enter a password
        If the initial of the password is uppercase then check if it is ‘A’ or not.
        If it is ‘A’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

        If the initial of the password is lowercase then check if it is ‘z’ or not.
        If it is ‘z’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid

 */

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a password...");
            String pwd = scan.nextLine();

            //How to get first character from a String

            char firstChar = pwd.charAt(0);

            if(firstChar>='A' && firstChar<='Z'){
                if(firstChar=='A'){
                    System.out.println("Valid Password");
                }else{
                    System.out.println("Invalid Password");
                }
            }else if(firstChar>='a' && firstChar<='z'){
                if(firstChar=='z'){
                    System.out.println("Valid Password");
                }else{
                    System.out.println("Invalid Password");
                }
            }else{
                System.out.println("Invalid password because first character must be letter");
            }

            // Used 2. condition a number and used toLowercase,
        // For password could input Uppercase
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password");
        String pass = sc.nextLine().trim().toLowerCase();


        char sus = pass.charAt(0);
        int two = pass.charAt(1);

        if (sus >= 'a' && sus <= 'z') {
            if (sus >= 'e' && sus <= 'h') {
                System.out.println("valid pasword");
            } else {
                System.out.println("invalid");
            }
        }

        else if (two >= 0 && two <= 9) {
            System.out.println("valid pasword");
        } else {
            System.out.println("invalid ");

        }

    }

    }


