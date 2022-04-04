package Techday33Mapsanditerator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TreeMap {

    public static void main(String[] args) {
        List<String > list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

//        for (String w: list1){
//
//          list1.remove(w);
//
//        }
//        list1.remove("A");
        System.out.println(list1);

        ListIterator list1Itr = list1.listIterator();

        while (list1Itr.hasNext()){
            Object element =  list1Itr.next();
        }

    }

}
