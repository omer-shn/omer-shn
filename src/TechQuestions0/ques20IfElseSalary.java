package TechQuestions0;

import java.util.Scanner;

public class ques20IfElseSalary {
    public static void main(String[] args) {

        // 5)	Ask user to enter annual salary, if the salary is more than or equal
        //to $80.000 output will be “I accept the oﬀer”, if the salary is between
        //$60.000 and $80.000 out put will be “I negotiate to increase”, otherwise output will be “I do not accept the oﬀer.”



        Scanner salary =new Scanner(System.in);
        System.out.println("enter salary");
        double sal = salary.nextDouble();

        if(sal>=80000) {
            System.out.println("ı accept the offer");
        }else if(sal>=60000 && sal<=80000) {
            System.out.println("i nogatiate to increrase");
        }else {
            System.out.println("i don't accept the offer");
        }







    }
}
