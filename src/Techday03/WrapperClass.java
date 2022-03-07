package Techday03;

import javax.sound.midi.Soundbank;

public class WrapperClass {
    public static void main(String[] args) {

            /*
                boolean  >>>Boolean
                char >>>> Character
                byte >>>> Byte
                short >>>> Short
                int >>>>> Integer
                long >>>>> Long
                float >>>>> Float
                double >>>>>Double  */

        Boolean a =true;
        Character b ='@';
        Integer c= 123;
        Double d= 3.14;
        String e="selam";



       //wrapperclass değişkenleri başka işlevlerde kullanılabilir.





        char cas = 'd';  //primitive
         Character das = cas; //  Wrapper

        Short s=24; //wrapper
        short ps=s;// primitive

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        String name ="A";
        char ch= 'A';
        System.out.println(name);
        System.out.println(ch);

        Integer is=12;
        int ki=is;
        System.out.println(ki);

    }
}
