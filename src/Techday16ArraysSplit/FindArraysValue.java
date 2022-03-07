package Techday16ArraysSplit;

import java.util.Arrays;

public class FindArraysValue {
    public static void main(String[] args) {

        int[] arr1 = {5, 12, 32};
        int[] arr2 = {5, 12, 32};

        boolean flag = false;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[2]) {
                    flag = true;
                    break;
                }
            }

                    if (flag) {
                        System.out.println("The array values are different");
                    } else {
                        System.out.println("Array values are the same");
                    }
                } else {
                    System.out.println("Arrays are different");
                }


            // SECOND way

            boolean isSame = Arrays.equals(arr1,arr2);
        if(isSame) {
            System.out.println("Arrays are the same");
        }else {
            System.out.println("Arrays are different");
        }

    }

    }

