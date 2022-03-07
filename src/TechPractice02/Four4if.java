package TechPractice02;

import java.util.Scanner;

public class Four4if {

    public static void main(String[] args) {


        Scanner pass = new Scanner(System.in);
        System.out.println("Enter password");
        String en = pass.nextLine().toLowerCase();

        char fi = en.charAt(0);
        char li = en.charAt(en.length() - 1);
        char mi = en.charAt(en.length()-2);


        if (fi >= 'a' && fi <= 'z') {
            if (li == 'x') {
                if (mi=='9') {
                    if (en.contains("#")) {


                        System.out.println("welcome " + en);

                    } else{
                        System.out.println("invalid password");
                    }
                }
        }
    }

    }
    }

