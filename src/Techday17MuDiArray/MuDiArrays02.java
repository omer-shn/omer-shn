package Techday17MuDiArray;

import java.util.Arrays;

public class MuDiArrays02 {
    public static void main(String[] args) {

        String arr1[][] = {{"learn", "java", "it"}, {"is", "easy"}};


        //How to find the number of elements in a multidimensional array
        for (String[] w : arr1) {
            for (String m : w) {

                if (m.contains("a")) {  // a içeriyorsa yürüt yoksa geç.
                    System.out.print(m + " "); // >>>> learn java easy
                }
            }
        }

        System.out.println(); //for gap

        // find the total number of elements in an array
        int sum=0;
        for(String[] w: arr1) {
            sum = sum +w.length;
        }
        System.out.println(sum);


        String newarr[]= new String[sum];

        int idx =0;
        for(String[] w : arr1) {  // To transfer to the another Array
            for(String m : w) {
                newarr[idx] =m;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newarr));

    }
}


