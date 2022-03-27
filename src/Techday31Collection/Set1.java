package Techday31Collection;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {

        Set<Integer> se =new TreeSet(); //Caution!!! Datatype is  Object
        se.add(4);
        se.add(7);
        se.add(11);
        System.out.println(se);

        se.add(33);
        System.out.println(se);

       Set<Integer> list =new TreeSet<>();
        list.add(5);
        list.add(7);
        list.add(59);
        list.add(11);
        list.add(25);
        System.out.println(list);
        System.out.println(se.retainAll(list));
        System.out.println(se);





    }
}
