package Techday31Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFifo {
    public static void main(String[] args) {

        Queue<String> tail =new LinkedList<>();
        tail.add("Latih");
        tail.add("Ekrem");
        tail.add("Ridvan");
        System.out.println(tail);

        tail.remove();
        tail.add(null);
        System.out.println(tail);
    }
}
