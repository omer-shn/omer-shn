package Techday30CollectionIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Iterator01 {

    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(11);
        list.add(2);


        Iterator itel =list.iterator();


        for( int i=0;i<list.size();i++) {
            System.out.println(itel.hasNext()+"====="+itel.next());
        }
        System.out.println(itel.hasNext());//false
        System.out.println(itel.next());//exception ===>NoSuchElement


    }
}
