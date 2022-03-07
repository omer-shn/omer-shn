package Techday06;

public class switchStatement3ValueJJJ {

    public static void main(String[] args) {


        int i =1;
        int j=3;
                    // cautıon !! we dont need use >>System.out.println<<< on every lines in aritmetics operations
        switch (i) {
            case 2: j+=0;
            case 4: j+=1;
            case 1: j+=4;  // only this executes the methods
            default: j+=2;
        }
        System.out.println("j= "+j);// what is result >>  result j=6

        //

        int q =2; // CAUTION !!!   CASE rakamı
        int w=2;

        switch (q) {
            case 1: w++;
            case 2: w+=3;
            case 3 :w++;
            case 4: w-=7;

        }
        System.out.println(w);

    }
}
