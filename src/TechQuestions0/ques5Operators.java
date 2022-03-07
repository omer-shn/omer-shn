package TechQuestions0;

public class ques5Operators {
    public static void main(String[] args) {

        //How to Increase Value of a Variable?

        int i= 9;
        i++;   // For Decrease  i--;
        System.out.println(i);

        int is=9;
        ++is; // For DEcrease  --is
        System.out.println(is);

        int ip = 9;
        ip+=5;  //  OR  ip=ip+5
        System.out.println(ip);

        int il =9;
        il*=3; //OR  il=il*3
        System.out.println(il);

        System.out.println(38 / 2 - ( 4 + 3) * 2 ); // Result = 5
        System.out.println(8 + 2 * ( 14 - 6 / 2) - 12 ); //Result =18

        //Write a program to add an integer variable having value 5
        //and a double variable having value 6.2. Print the sum on the console.

        int iy= 5;
        double ij=6.2;
        System.out.println(iy+ij);

        //Create an integer variable and increase it by 1, by using LoopForROCKSTAR diﬀerent ways, then type every result on the console.

        int one= 1;
        int two=1+1;
        int thr=++one;
        int fo=one++;
        System.out.println(two);
        System.out.println(thr);
        System.out.println(fo);

        // Decrease
        int dec=1;
        int m1=1-1;
        int m2=--dec;
        int m3=dec--;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        //Modülüs
        int mo= 20;
        int mod=8;
        System.out.println("remain :"+mo%mod);

    }
}
