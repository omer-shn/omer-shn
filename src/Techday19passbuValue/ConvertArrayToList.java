package Techday19passbuValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);

      int count =0;
      for(int w : list) {
          count++;
          if(count==2){
              continue;
          } System.out.println(w+" ");
      }

    }
}
