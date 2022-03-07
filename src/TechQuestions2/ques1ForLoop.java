package TechQuestions2;

public class ques1ForLoop {

    public static void main(String[] args) {
        //Write a program to print counting numbers from 10 to 57 on the console by using for-loop.


        for(int a=10; a<=57;a++)
            System.out.print(a+" ");


        System.out.println();
        //Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.

        for(int b=100;b>=43;b-=2)
            System.out.print(b+" ");

        System.out.println();
        //Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop.

        for(int c=199; c>=33;c-=2)
            System.out.print(c+" ");

        System.out.println();
        //Write a program to add counting numbers from 23 to 25   and 18 -20 by using for-loop. Print the sum on the console

        int num = 25, sum=0;
        for(int d=23;d<=num;d++)
            sum+=d;
        System.out.println(sum);

        int kun=20, yun=0;
        for(int iv=18;iv<=kun;iv++)
            yun+=iv;
        System.out.println(yun);

        //Write a program to multiply counting numbers from 7 to 10 by using for-loop. Print the multiplication on the console

       int mul =10, lum=1;
       for(int e=7;e<=mul;e++)
           lum*=e;
        System.out.println(lum);

        //Write a program to print counting numbers which are less than 200 and divisible by 5 On the console by using for-loop.

        for(int f=200; f>=100;f-=5)
            System.out.print(f+" ");

        System.out.println();

        //



    }
}
