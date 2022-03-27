package Techday30CollectionIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator03 {
    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(11);
        list.add(2);

        Iterator iber =list.iterator();

        while (iber.hasNext()) {
            iber.next();
            iber.remove();

        }
        System.out.println(list);
    }
}
