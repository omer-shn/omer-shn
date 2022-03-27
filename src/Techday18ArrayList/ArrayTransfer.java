package Techday18ArrayList;

import java.util.Arrays;

public class ArrayTransfer {
    public static void main(String[] args) {


        String mdi[][] = {{"Today "}, {"weather is"}, {"very cloudy"}};
        int top = 0;
        for (String[] y : mdi) {
            top += y.length;
        }
        System.out.println(top);
        String pas[] = new String[top];
        int der = 0;
        for (String[] va : mdi) {
            for (String za : va) {
                pas[der] = za;
                der++;
            }
        }
        System.out.println(Arrays.toString(pas));
    }

}
