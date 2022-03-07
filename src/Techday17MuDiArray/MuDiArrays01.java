package Techday17MuDiArray;

import java.util.Arrays;

public class MuDiArrays01 {
    public static void main(String[] args) {

        //How to create multidimensional array
        int md1 [][] =new int [3][2];

        //How to print mudi arraY
        System.out.println(Arrays.deepToString(md1)); //[[0, 0], [0, 0], [0, 0]]

        //how to assign value
        md1[0][1]=9;
        System.out.println(Arrays.deepToString(md1));// [[0,9], [0,0],[0,0],[0,0]]

        md1 [1][1]=3;
        System.out.println(Arrays.deepToString(md1));//[[0, 9], [0, 3], [0, 0]]

        //how to create mudi array in SHORT Way

        int md2 [][]= { {2,3},{12},{21,34,56},{4}};
        System.out.println(Arrays.deepToString(md2));

        //how the print inner array
        System.out.println(Arrays.toString(md2[2])); //{21,34,56}

        //how to find the number of elements// { {2,3},{12},{21,34,56},{4}} >>>>>> Herbirinin içi dikkate alınır 2+1+3+1=7
        int sum=0;
        for(int[] w: md2) {
            sum=sum+w.length;
        }
        System.out.println(sum);



    }

}
