package Techday14StaticArrays;

public class Arrays01 {
    public static void main(String[] args) {


        int [] qas= { 12,12,3,71};


        // Sum With For
       int sum=0;

        for(int i=0; i<qas.length;i++) {
            sum= sum+qas[i];

            System.out.println(sum);

        }
        System.out.println(sum);

       // Sum  With While

        int tot=0;
        int a=0;
        while(a<qas.length) {
            tot=tot+qas[a];

            a++;
        }
        System.out.println(tot);

    }
}