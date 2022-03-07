package Techday15ForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {

        String srr[]= { "Veli","Michael","Ali","Maria"};

        System.out.println(Arrays.toString(srr));

        Arrays.sort(srr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(srr));

      Arrays.sort(srr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(srr));

        //

        String namarr []= {"mano","carrot","clove","vinegar"};
        System.out.println(Arrays.toString(namarr));







    }
}
