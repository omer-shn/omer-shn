package Encapsulation;

public class Card {
    public static void main(String[] args) {


        CreditCard nevCard = new CreditCard("Bilal Uzun",673498,true);
        System.out.println(nevCard.getName());
        System.out.println(nevCard.getNumber());
        System.out.println(nevCard.getActive());

        nevCard.setActive(false);
        System.out.println(nevCard.getActive());
    }
}
