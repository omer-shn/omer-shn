package Techday31Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm1= new HashMap<>();
        hm1.put(100,"Ali");
        hm1.put(101,"Veli");
        hm1.put(102,"Can");
        hm1.put(104,"Canan");
        hm1.put(null,"Aliye");
        hm1.put(null,"Kemal"); //it removes the Aliye, because key is unique
        hm1.put(105,null);
        hm1.put(106,null);
        System.out.println(hm1);

        HashMap<Integer,String> hm2=new HashMap<>();
        hm2.put(87,"K");
        hm2.put(88,"L");
        hm2.put(89,"M");

        hm1.putAll(hm2);
        System.out.println(hm1);

        hm1.putIfAbsent(102,"Z"); //Already 102 is exist
        System.out.println(hm1);
        hm1.putIfAbsent(999,"Z");// it adds key 999 & value Z
        System.out.println(hm1);

        String value = hm1.get(101); //gives key 101
        System.out.println(value);
        String value2 = hm1.get(555);// give null
        String value3 =hm1.getOrDefault(999,"this key is exist in the map");
        String value4 =hm1.getOrDefault(9999,"this key is not exist in the map");

        Set<Integer> myKeys =hm1.keySet();//gives all keys
        System.out.println(myKeys);

        Collection<String> myValues =hm1.values();//gives all values
        System.out.println(myValues);

        Set<Map.Entry<Integer,String>> setForMap =hm1.entrySet();//it converts Map to Collection

        for(Map.Entry<Integer,String> w: setForMap) {
            System.out.println(w);//gives keys & vales one by one
            System.out.println(w.getValue());//gives all value
            System.out.println(w.getKey());//gives all key
        }



    }
}
