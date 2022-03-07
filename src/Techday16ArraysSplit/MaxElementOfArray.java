package Techday16ArraysSplit;

import java.util.Arrays;

public class MaxElementOfArray {
    public static void main(String[] args) {

        int [] ars ={ 12,23,9,34,3,29};

        Arrays.sort(ars);
        System.out.println(Arrays.toString(ars));
        int max =ars[ars.length-1];
        System.out.println("Max value :"+max);


        // SECOND WAY
        int mx = ars[0];
        for(int i=0;i<ars.length;i++) {
            if(mx < ars[i]) {
                mx = ars[i];
            }
        }
        System.out.println("Max number is :"+mx);



    }
}
