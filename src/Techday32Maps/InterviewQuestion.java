package Techday32Maps;

import java.util.Arrays;
import java.util.HashMap;

public class InterviewQuestion {
    public static void main(String[] args) {

        String str = "Java is easy. Type codes to learn Java. To earn money learn Java";
        String words [] = str.replaceAll("\\p{Punct}","").split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> result =new HashMap<>();

        for (String w: words ){

            Integer numOfOccurrence =result .get(w);
            if (numOfOccurrence==null) {
                result.put(w,1);
            }else {
                result.put(w, numOfOccurrence + 1);
            }

        }
        System.out.println(result);
    }
}
