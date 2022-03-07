package Techday15ForEachLoop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        int arr [] ={ 12,23,12,35,46};

        for(int w : arr) {
            if(w==12) {
                System.out.println(w+" exist");
                break;
            }
        }
        // index yöntemi

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,23));

    }
}
