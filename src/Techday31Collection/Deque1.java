package Techday31Collection;

import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String[] args) {

        Deque<String> doub = new LinkedList<>();
        doub.add("star");
        doub.add("galaxy");
        System.out.println(doub);

        System.out.println(doub.pop());

        doub.push("seyfi");
        System.out.println(doub);
        }
    }

