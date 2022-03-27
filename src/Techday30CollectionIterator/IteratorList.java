package Techday30CollectionIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorList {
    public static void main(String[] args) {

        List<String > list =new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayşe");
        list.add("Fatma");
        list.add("Emrah");
        System.out.println(list);

        ListIterator li =list.listIterator();

        while (li.hasNext()) {
            li.set("Z"+li.next()+"X");
        }
        System.out.println(list);


    }
}
