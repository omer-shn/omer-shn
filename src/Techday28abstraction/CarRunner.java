package Techday28abstraction;

public class CarRunner {
    public static void main(String[] args) {

  //      Car car =new Car() {
   //we cannot create an object from abstract classes


        Car car1 =new Toyota();
        car1.make();//My car is Toyota
        car1.model();
        car1.year();

        //inheritance
        //polymothipsm
        //abstraction
        System.out.println("=================");

        Car car2=new Honda();
        car2.make();
        car2.model();
        car2.year();
        }
    }

