package Techday30CollectionIterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {

        //Caution!!! No Dublication.
        HashSet<String> hs =new HashSet<>();
        hs.add("k");
        hs.add("k");
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);

        HashSet<String> hss =new HashSet<>();
        hss.add(null);
        hss.add("k");
        System.out.println(hss);
        System.out.println(hs.equals(hss));

        //Interview Question: Type a code to display arrayList elements only once.
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);//[5, 5, 2, 3, 2, 3, 5]
        HashSet<Integer> hs3 = new HashSet<>(list);
//        hs3.addAll(list);
        System.out.println(hs3);//[2, 3, 5]
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add(null);//null object
        set.add("null");// null is string
        set.add("B");
        System.out.println(set);//[null, A, B]


    }
}
