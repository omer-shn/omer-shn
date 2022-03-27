package Techday31Collection;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {

        LinkedList<Integer> lin =new LinkedList<>();
        lin.add(5);
        lin.add(7);
        lin.add(15);

        System.out.println(lin.peek()); //First Element
        System.out.println(lin.peekFirst());

        LinkedList<Integer> lin2 =new LinkedList<>();
        System.out.println(lin2.peekFirst());
        System.out.println(lin2.peek());

        System.out.println(lin.element()); //First elemnt
     //   System.out.println(lin2.element());//Exception

        System.out.println(lin.poll());
        System.out.println(lin);

        System.out.println(lin.hashCode());
        System.out.println(lin.offer(10));
    }
}
