package Techday31Collection;

import java.util.Arrays;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        int arr [] = {3,6,8,11,11,2,9,3,24,7};

        Set<Integer> setter = new java.util.HashSet<>();
        for(Integer e:arr) {
            setter.add(e);

        }
        System.out.println(setter);

        Object[] satarr= setter.toArray();
        System.out.println(Arrays.toString(satarr));


    }
}
