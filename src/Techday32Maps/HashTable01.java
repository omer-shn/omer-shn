package Techday32Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTable01 {
    public static void main(String[] args) {


        Hashtable<String,Integer> htp = new Hashtable<>();
        htp.put("Ali",300);
        htp.put("Tom",500);
        htp.put("Alexandra",12000);
        htp.put("Mark",5000);
      //  htp.put("Can",null); NullPointerException
        System.out.println(htp);

        System.out.println(htp.containsKey("Ali"));//true
        System.out.println(htp.containsValue(300));//true

        Hashtable<String,Integer> htp2 =new Hashtable<>();
        htp2.put("Ali",300);
        htp2.put("Tom",500);
        htp2.put("Alexandra",12000);
        htp2.put("Mark",5000);

        System.out.println(htp.equals(htp2));

        System.out.println(htp2.isEmpty());



    }
}
