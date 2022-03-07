package TechQuestions0;

import java.util.Scanner;

public class ques15IfDiscount {
    public static void main(String[] args) {

        //Type java code by using if-else statement.
        //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        //Ask user for quantity and unit price then judge and print total cost for user.
        //If the quantity is less than 1000 output will be “No discount.”

        Scanner discount =new Scanner(System.in);
        System.out.println("Enter the quantity");
        int quantity = discount.nextInt();
        System.out.println("Enter the price");
        double price = discount.nextDouble();
        double amount= quantity*price;

        if (amount>1000){
            System.out.println("10% Discount price :"+(amount/100)*90);
        } else {
            System.out.println("no discount");
        }


    }
}
