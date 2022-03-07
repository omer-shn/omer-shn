package Techday15ForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {


        String urr[] = {"Enes", "Talha", "Veli", "Ümit", "Hasan", "Behcet", "Karmen"};
        Arrays.sort(urr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(urr));






    }
    }