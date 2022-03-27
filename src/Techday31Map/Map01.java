package Techday31Map;

import java.util.*;

public class Map01 {

    //Key -Value parametreleri ile işlem yapılır.
    public static void main(String[] args) {

        Map<Integer, String> mp =new HashMap<>();

        mp.put(101,"Ali,Can,J.dev");
        mp.put(102,"Ekrem,Sah,QA");
        mp.put(103,"Hasan,Gul,C#");

        int no=104;
        String name="Ayse";
        String lastname="Can";
        String branj ="QA";

        mp.put(no,name+" ,"+lastname+" ,"+branj);

        System.out.println(mp);

        System.out.println(mp.get(102));  //Person of no 102
        System.out.println(mp.get(104));
        System.out.println(mp.keySet()); //gets the keys
        System.out.println(mp.values());

      List<String> valist =new ArrayList<>((mp.values()));
        System.out.println(valist);

        System.out.println(mp.size()); //Four Elements (4 person);

        List<String> namelist =new ArrayList<>();
        String info []= new String[3];

        for(int i=0; i<valist.size();i++) {
            info=valist.get(i).split(",");
            namelist.add(info[0]);
        }
        System.out.println(namelist);


    }
}
