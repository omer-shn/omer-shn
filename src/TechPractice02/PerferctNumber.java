package TechPractice02;

public class PerferctNumber {
    public static void main(String[] args) {

        /*
Type a program to check if a positive number is perfect or not
For example if the number is 6, we should see
Perfect Number
on the console.
(The factors of 6 are : 1,2,3,6
1+2+3=6  ==> it is perfect number )
*/
        int num = 28;
        int sum = 0;

        for(int i=1; i<num;i++) {
            if(num%i==0) {
                System.out.print(i+ " "); // to see factors
                sum =  sum +i;
            }

        }
        if( sum ==num) {
            System.out.println("perfect number");
        } else {
            System.out.println("not perfect");
        }


    }
}
