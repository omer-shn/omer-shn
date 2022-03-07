package TechQuestions0;

public class ques9IfStateEvenOddAndDays {
    public static void main(String[] args) {

        //1)	Type java code, if an integer is even, output will be “The integer is even”. If the integer is odd, output will be “The integer is odd”.
        int ev =12;
        if(ev%2==0) {
            System.out.println("This is even");
        }
            if (ev%2!=0){
                System.out.println("This is odd");

            }


      //2)	Type java code by using if statement. When you enter the initial of the day of a week, output should be all possible names of the days.
      //For example; if the initial is ’S’ output should be “Saturday or Sunday”


       String day="T";

            if (day=="M") {
                System.out.println("The day is Monday" );
            }
        if (day=="T") {
            System.out.println("The day is Tuesday or Thursday" );
        }
        if (day=="w") {
            System.out.println("The day is Wednesday" );
        }
        if (day=="F") {
            System.out.println("The day is Friday" );
        }
        if (day=="S") {
            System.out.println("The day is Saturday or Sunday" );
        }





    }
}

