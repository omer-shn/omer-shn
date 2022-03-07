package TechPractice02;

public class MYSELFNumbers1to100 {
    public static void main(String[] args) {

         /*
         Print on the console numbers from 1 to 100.
         But do not use any number in your code!
         */
        int n = 'a'/'a'; // 'b' - 'a'
        int m = 'd'; // ASCII value of d is ==> 100
        while (n <= m){
            System.out.print(n + " ");
            n++;
        }

        System.out.println();

        char num =' '-' '+1;  // Myself solving
        char num2= 'd';

        for (int i =num; i<='d'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for(char ch='c'/'c';ch<'e';ch++)
        {
            System.out.print((int)ch+" ");
        }


    }
}
