package Techday30CollectionIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator02 {
    public static void main(String[] args) {


        List<Integer> list =new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(11);
        list.add(2);

        Iterator iter =list.iterator();

        iter.next();
        iter.next();
        iter.next();
        System.out.println(iter.next());

        iter.remove();
        System.out.println(list);

    //   System.out.println(iter.remove()); //error verir


    }
}
