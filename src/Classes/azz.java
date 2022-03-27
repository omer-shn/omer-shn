package Classes;

import java.util.Arrays;

public  class azz {
    public static void main(String[] args) {

       int arr[] = {1, 4, 3, 19, 11, 2, -6, 7, -9, -12};
        int tarr[] = {1, 4, 3, 5, 19, 11, 2, -7, -17, -9, -12};

        System.out.println(Arrays.toString(countPosAddNonPos(arr)));
        System.out.println(Arrays.toString(nvpcs(tarr)));


    }

    public static int[] countPosAddNonPos(int[] arr) {

        int nump = 0;  //
        int sump = 0;  //
        for (int w : arr) {
            if (w > 0) {
                nump++;
            } else {
                sump += w;
            }
        }
        int result[] = {nump, sump};
        return result;
    }

    public static int[] nvpcs(int[] tarr) {

        int poz = 0;
        int negtot = 0;
        for (int tk : tarr) {
            if (tk > 0) {
                poz++;
            } else {
                negtot += tk;


            }
        }
        int aim[] = {poz, negtot};
        return aim;
    }
}
