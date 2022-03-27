package Encapsulation;

public class Train {

    String passenger ="HasanCetinkaya";
    int seat =32;
    double price= 25.40;

    Train (String passenger,int seat, double price) {

        this.passenger=passenger;
        this.seat=seat;
        this.price=price;
        this.setPrice(price);
    }
    public String getPassenger(){
        return passenger;
    }
    public int getSeat() {
        return seat;
    }
    public double getPrice() {
        return price;
    }
   public void setPrice(double price){
        this.price=price;
    }

}

