package Techday16ArraysSplit;

import java.util.Arrays;

public class ContainsValueArray {
    public static void main(String[] args) {

        int [] arr = {34,54,12,37,29};// 5 values

        int expectedElement =12;
        int count=0;
        for(int i=0; i<arr.length;i++) {

            if(arr[i] == expectedElement) {
                count++;
                break;
            }
        }
        if(count >0) {
            System.out.println("Arrays contasins expected value");
        }else {
            System.out.println("Arrays dos not contain expected value");
        }

                //SECOND WAY-one sentence !!!!!


        System.out.println("Binary search result :"+Arrays.binarySearch(arr, expectedElement));










    }
}
