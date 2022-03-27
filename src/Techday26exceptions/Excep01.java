package Techday26exceptions;

public class Excep01 {
    public static void main(String[] args) {

        /* 1)Exception means un-expected issues in your codes.
          Like "Gas Finishing" in your vacation
        2)There are 2 ways to work with Exceptions
          a)Exception Handling: try-catch blocks
          b)Throw Exception

          1)If you think any problem can occur for any line of code, put it inside the try-block then create a catch-block
        2)Inside the catch-block parenthesis put the possible exception class.
        3)By using "e.getMessage()", you can get technical message
        4)If you want you can put a non-technical message inside the catch body
        5)If the codes inside the try-body works without any issue. catch-block will not be executed.
        **** 6)After any Exception occurred next lines of codes cannot be executed, JAVA STOPS EXECUTION
         */

        divide(12,3);
        divide(0,3);

        divide(12,0); //This is exception (Exceptions mean unexpected issue.)

        //Here, Java says that "i need your help". How can i handle this issue?

    }
    public static void divide(int a, int b) {

      /*
        if (b == 0) {
            System.out.println("Divisor cannot be zero");
        } else {
            System.out.println(a / b);
        }

       */

        try {
            System.out.println(a / b);
        }catch (ArithmeticException e) {
            System.out.println("Could not divide==> "+ e.getMessage());
        }
    }


}
