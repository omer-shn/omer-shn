package Techday10ForWhile;

public class LoopFor1Palindrome {
    public static void main(String[] args) {


        int sum=25;
        for(int ip=12; ip<15; ip++) {

            sum=sum+ip;
        }
        System.out.println(sum);

        System.out.println();

        // multiply 3 to 5
        int prod =1;
        for(int io=3; io<6; io++) {
            prod=prod*io;
            System.out.println(prod); // Tüm çarpımları görmek için >> to see all mulpicilation
        }
        System.out.println(prod);// sadece sonucu görmek için >> just to see the result >>outside the paranteses

        //14 to 10 multiply 2 by 2

        int kul= 1;
        for( int iu=14; iu>=10; iu-=2) {
            kul=kul*iu;
        }
        System.out.println(kul);

        System.out.println();

        // PALINDROME
        int numm=12321;
        String rever="";
        String fnum =String.valueOf(numm);

        for( int ik=fnum.length()-1; ik>-1;ik--) {
            rever=rever+fnum.charAt(ik);

        }
        if(fnum.equals(rever))
        {
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

        System.out.println();

        //To find the sum of the digits
        int dig= 753;
        int digsum= 0;

        for(int ih=dig;ih>0; ih=ih/10){

          digsum=   digsum + ih%10 ;

        }
        System.out.println(digsum);

        System.out.println();

        //












    }
}
