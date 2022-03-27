package Techday31Collection;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<Integer> lin=new LinkedList();

        lin.add(5);
        lin.add(7);
        System.out.println(lin);
        lin.add(0,10);
        System.out.println(lin);
        lin.addFirst(3);
        System.out.println(lin);

        LinkedList<Integer> linn =new LinkedList<>();
        linn.addAll(lin);
        System.out.println(lin);
        linn.addAll(2,lin);
        System.out.println(linn);


    }
}
