package Techday18ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {


        int arr[] = {2, 4, 6, 8};
        List<Integer> today = new ArrayList<>();
        int i = 0;
        do {
            today.add((arr[i]));
            i++;
        } while (i < arr.length);
        System.out.println(today);
        }
    }

