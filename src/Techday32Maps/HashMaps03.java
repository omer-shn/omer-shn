package Techday32Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps03 {
    public static void main(String[] args) {


        HashMap<String, Integer> hes = new HashMap<>();
        hes.put("Math",8);
        hes.put("Java",9);
        hes.put("SDLC",9);
        hes.put("API",7);
        System.out.println(hes);
        System.out.println(hes.keySet());//
        System.out.println(hes.values());

        Set<String> kyy = hes.keySet();

        for (String w:kyy) {
            System.out.println(w + " ");
        }

            Collection<Integer> val= hes.values();
            for(Integer x :val) {
                System.out.println(x);
            }

        Set<Map.Entry<String,Integer>> setForm = hes.entrySet();
                System.out.println(setForm);

         for(Map.Entry<String,Integer> z :setForm) {
             System.out.println(z);
         }
/*
          for (Map.Entry<String,Integer> q : setForm) {
              if (q.getValue()>8) {
                  System.out.println("The courses with grades grater than 8 ==>"+q.getKey());
              }

 */
        System.out.println(hes.get("Math"));

       hes.replace("SDLC",10);
        System.out.println(hes);
        Integer oldValue =hes.replace("SDLC",1);
        System.out.println("Old value of SDLC :"+oldValue);

        boolean isTrue = hes.replace("API",7,10);
        System.out.println(isTrue);
        System.out.println(hes);

    // Caution!!!   Below Methods removes the value
        hes.remove("SDLC");
        System.out.println(hes);

        Integer rmv =hes.remove("API");
        System.out.println(rmv);
        System.out.println(hes);

        boolean isCorrect = hes.remove("Java",9);
        System.out.println(isCorrect);
        System.out.println(hes);





         }


            }




