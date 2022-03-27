package Classes;

public class CreditCard {

    private   String name = "creditCard";
    private int number = 435671;
   private  boolean active=true;

        CreditCard(String name, int number, boolean active) {

            this.name=name;
            this.number=number;
            this.active=active;
            this.setActive(active);

        }
        public String getName(){
            return name;
        }
    public int getNumber(){
        return number;
    }
    public boolean getActive(){
        return active;
    }
    public void setActive(boolean active){
      this.active=active;
      }
}






