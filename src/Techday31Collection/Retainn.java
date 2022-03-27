package Techday31Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Retainn {
    public static void main(String[] args) {

        Set<String > hss=new LinkedHashSet<>();
        hss.add("Ali");
        hss.add("Mehmet");
        hss.add("Hasan");
        hss.add("Kutlu");

        Set<String > hss1=new LinkedHashSet<>();
        hss1.add("Ali");
        hss1.add("Mehmet");
        hss1.add("Filiz");
        hss1.add("Hasan");

        /*

       System.out.println(hss.retainAll(hss1));
        System.out.println(hss);
        System.out.println(hss1);
         */
        System.out.println(hss1.retainAll(hss));
        System.out.println(hss);
        System.out.println(hss1);

    }
}
