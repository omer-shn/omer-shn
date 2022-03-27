package Techday31Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<Character,String> hmp=new HashMap<>();
        hmp.put('A',"AFYON");
        hmp.put('B',"BURSA");
        hmp.put('C',"CEYLAN");
        hmp.put('D',"DENIZ");
        hmp.put('E',"ENES");
        System.out.println(hmp);
        hmp.put('N',null);
        System.out.println(hmp.get('E'));
        String val =hmp.get('E');
        System.out.println(val);
        System.out.println(hmp.keySet());
        Collection<String> vl=hmp.values();
        System.out.println(vl);
        Collection<Character> ch=hmp.keySet();
        System.out.println(ch);

        HashMap<Character,String> hsm =new HashMap<>();
        hsm.put('F',"FAS");
        hsm.put('G',"GAZ");

        hsm.putAll(hmp);
        System.out.println(hsm);

        Set<Map.Entry<Character,String>> cov=hsm.entrySet();

        for (Map.Entry<Character,String> tk: cov) {
            System.out.println(tk);
            System.out.print(tk.getValue()+" ");
            System.out.println(tk.getKey()+" ");
        }





    }
}
