package ZSpecial;

import java.util.Scanner;

public class Palındrome {
    public static void main(String[] args) {

        Scanner biz = new Scanner(System.in);
        System.out.println("İnput a word");
        String word = biz.nextLine();

        String rvse="";
        String reword= String.valueOf(word);
        for(int i=reword.length()-1;i>-1;i--) {
            rvse=rvse+reword.substring(i,i+1);
        }
        if(reword.equals(rvse)) {
            System.out.println("palindrome");

        }else {
            System.out.println("no palindrome");
        }
    }
}
