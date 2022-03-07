package Techday18ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<Integer>originalList = new ArrayList<>();
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(2);
        originalList.add(5);

        ArrayList<Integer>uniqueList =new ArrayList<>();
            for(Integer w: originalList) {
                if(!uniqueList.contains(w)) {
                    uniqueList.add(w);
                }
            }
        System.out.println(uniqueList);

                //2.WAY
        ArrayList<Integer> uniqueList2 = new ArrayList<>(originalList);

        int count=0;

        for(Integer w: originalList) {
            for(int i=0; i<uniqueList2.size();i++) {
            if(w.equals(uniqueList2.get(i))) {
                count++;
            }
        }
            if(count>1){
                for(int k=1;k<count;k++) {
                    uniqueList2.remove(Integer.valueOf(w));
                }
                }
            count=0;
            }
        System.out.println(uniqueList2);

    }
}
