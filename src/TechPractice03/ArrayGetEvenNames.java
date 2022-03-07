package TechPractice03;

import java.util.Arrays;

public class ArrayGetEvenNames {
    public static void main(String[] args) {

                // To get 0,2,6 namely  to get even elements
        String list []= { "Ali","john","Hasan","Brad","Mary","Ayse"};
        System.out.println(Arrays.toString(list));
        for( int i= 0;i< list.length;i++) {
            if(i%2==0) {
                System.out.println(list[i]);
            }
        }
    }
}
