package Techday31Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList2 {
    public static void main(String[] args) {

        List<Integer> lin = new LinkedList(); //Caution List!!!
        lin.add(5);
        lin.add(7);
        System.out.println(lin);

        Queue<Integer> linn = new LinkedList<>();
        linn.add(5);
        linn.add(7);
        linn.clear();

        Deque<Integer>line = new LinkedList<>();
        line.add(5);
        line.add(7);
        line.addLast(20);
    }
}
