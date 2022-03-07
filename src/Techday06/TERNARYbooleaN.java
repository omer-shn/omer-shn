package Techday06;

public class TERNARYbooleaN {

    public static void main(String[] args) {


        int y = 32;  //For  -12   12   15   32

        boolean result = (y % 2 == 0 || y < 13) ? (true) : (y < 0 ? true : false);
        System.out.println(result);

        // for -12  true
        // for 12 true
        // for 15  false
        //  for 32 false  mark is ||

        int z = 32; //For  -12   12   15   32
        boolean result2 = (z % 2 == 0 && z < 13) ? (true) : (z < 0 ? true : false);
        System.out.println(result2);

        // for -12  true
        // for 12 true
        // for 15  false
        //  for 32 true   mark is &&
    }
}
