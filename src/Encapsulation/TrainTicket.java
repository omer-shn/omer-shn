package Encapsulation;

public class TrainTicket {

    public static void main(String[] args) {

        Train railway =new Train("Hasan Cetinkaya",32,25.40);
        System.out.println("Passenger :"+railway.passenger);
        System.out.println("Seat :"+railway.seat);
        System.out.println("Price :"+railway.price);

        railway.setPrice(0.00);
        System.out.println("New price :"+railway.price);
    }
}
