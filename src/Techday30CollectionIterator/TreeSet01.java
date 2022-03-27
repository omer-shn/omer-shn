package Techday30CollectionIterator;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        TreeSet<Integer> tre =new TreeSet<>();

        tre.add(35);
        tre.add(11);
        tre.add(29);
        tre.add(-4);
        tre.add(2);
        tre.add(6);
        tre.add(71);

        System.out.println(tre);

        TreeSet<String> tse=new TreeSet<>();
        tse.add("K");
        tse.add("Z");
        tse.add("A");
        tse.add("C");
        tse.add("T");
        System.out.println(tse);

        Long ti = System.nanoTime();

        HashSet<String> hsh =new HashSet<>();
        hsh.add("K");
        hsh.add("Z");
        hsh.add("A");
        hsh.add("C");
        hsh.add("T");
        System.out.println(hsh);

        TreeSet<String> tres =new TreeSet<>(hsh);
        System.out.println(tres);


        Long tim = System.nanoTime();
        System.out.println(ti-tim);
        System.out.println(tim-ti);













    }
}
