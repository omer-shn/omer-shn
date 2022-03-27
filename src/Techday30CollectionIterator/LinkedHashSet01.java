package Techday30CollectionIterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lh = new LinkedHashSet<>();

        lh.add(12);
        lh.add(33);
        lh.add(22);
        lh.add(5);
        lh.add(5);
        System.out.println(lh);

        List<Integer> list =new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);

        HashSet<Integer> nhs= new HashSet<>(); //We casn also use LinkedHasSet
        nhs.addAll(list);
        System.out.println(nhs);


    }
}
