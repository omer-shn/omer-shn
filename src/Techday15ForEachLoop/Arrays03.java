package Techday15ForEachLoop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {


        String srr []= {"Ayhan","Beyhan","Ceyhan"};
        System.out.println(Arrays.toString(srr)+"srr");

        String trr[]= new String[3];
        for(int i=0;i<3;i++) {
            trr[i] = srr[i];
        }
        System.out.println(Arrays.toString(trr)+"trr");

        String nrr [] = Arrays.copyOf(srr,3);
        System.out.println(Arrays.toString(nrr)+"nrr");

        Arrays.sort(trr);
        if(Arrays.equals(srr,trr)) {
            System.out.println("Array elements are in natural order");
        } else {
            System.out.println("Array elements are not natural order");
        }

        }
    }

