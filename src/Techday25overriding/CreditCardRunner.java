package Techday25overriding;

public class CreditCardRunner
{
    public static void main(String[] args) {

        CreditCard ccn1 = new CreditCard();
        System.out.println(ccn1.getCcn());

        String ccn = ccn1.getCcn();

        ccn1.setCcn("*************"+ccn.substring((ccn.length()-4)));
        System.out.println(ccn1.getCcn());

        ccn1.setCcn("not visible");
        System.out.println(ccn1.getCcn());
    }
}
