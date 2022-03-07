package Techday09ForLoops;

public class LoopFor {

    public static void main(String[] args) {

        for ( int ip=1;ip<6;ip++)
            System.out.println("selam");
        System.out.print("==========");

        // 11 to 44
        for( int id=11; id<45;id+=1)
            System.out.print(id+" ");


        System.out.println();
        // even
        for(int ir=10; ir<21;ir+=1) {
            if (ir % 2 == 0) {
                System.out.print(ir + " ");
            }
        }

        //
        System.out.println();
        for(int i = 68 ;    i > 12  ;  i-=1){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        //5.Example: Type all integers which are divisible by 4 and divisible by 6 from 120 to 11
        // in the same line with a space between consecutive integers.
        for(int iv = 120; iv>10 ;  iv-=1     ){
            if( iv%4 == 0  &&   iv%6 == 0){
                System.out.print(iv + " ");
            }
        }




    }
}
