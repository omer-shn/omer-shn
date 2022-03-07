package Techday17MuDiArray;

public class MuDiArrays03 {
    public static void main(String[] args) {

        //find the maximum element in 2dimensial array

        int a[][]= { {5,0},{-5,34},{65,22,31}}; // To fint max element

        int x =Integer.MIN_VALUE;

        for (int [] w : a) {
            for(int m :w) {
                if (x<m) {
                    x=m;
                }
            }
        }
        System.out.println(x);




    }
}
