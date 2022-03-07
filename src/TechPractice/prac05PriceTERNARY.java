package TechPractice;
import java.util.Scanner;
public class prac05PriceTERNARY {

    public static void main(String[] args) {



    int pr =14;
   String decision= (pr<=10) ? ("it's cheap"): (pr>10 && pr <=20) ? ("it is ok"): ("it is expensive");
        System.out.println(decision);

        // SECOND WAY

     /*   Write a code using ternary:
        Create int variable : price
        Create string variable : decision
        If the price equal or less than $10 Print “it's cheap”
        If price is 10-$20 print “it's ok”
        Otherwise “it's expensive”.
        EXAMPLE:
        INPUT      : price= 12
        OUTPUT  : it's ok
        INPUT      : price= 10
        OUTPUT  : it's cheap
        INPUT      : price= 23
        OUTPUT  : it's expensive
                */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the price?");
        int price = scan.nextInt();
        String dec = price <= 10  ?    "It is cheap "     :  price<=20   ? "It is OK " : "It is expensive"  ;
        System.out.println(dec);

    }
}
