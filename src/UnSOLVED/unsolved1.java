package UnSOLVED;

import java.util.Scanner;

public class unsolved1 {
    public static void main(String[] args) {

        //	Ask user to enter a String
        //  Print the characters whose indexes are odd on the console For example; Germany ==> e m n

        Scanner wer =new Scanner(System.in);
        System.out.println("input a word");
        String word =wer.nextLine().toLowerCase();

        String le =String.valueOf(word.length());


        System.out.println(le.length());


        for(int idx=1;idx<=le.length();idx+=2) {
            System.out.print(idx+" ");
        }
    }
}
