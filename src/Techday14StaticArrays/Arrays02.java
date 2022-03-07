package Techday14StaticArrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


        String myStringArray [] = new String[4];
        System.out.println(Arrays.toString(myStringArray));

        myStringArray[0]="veli";
        myStringArray[1]="can";
        myStringArray[2]="beyhan";
        myStringArray[3]="asım";
        System.out.println(Arrays.toString(myStringArray)); // To Get all liste. It is long way.

        //How to get alphabetic order
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray));// to get alphabetic order

        // How to get the elements in DIFFERENT lines

        for(String w : myStringArray) {
            System.out.println(w);    // to get different lines
        }

        //Print the list elements if the number of character is less than 4

      for(String w: myStringArray) {
          if(w.length()<4) {
              System.out.println("this name :"+w);
          }

          // Print the list elements if you see "Can" stop printing;

          for(String wg : myStringArray) {


              System.out.println(wg);
                if (wg.equals("qq"+"can")) {
                  break;
              }
          }


      }
    }
}
