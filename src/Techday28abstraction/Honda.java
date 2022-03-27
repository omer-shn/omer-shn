package Techday28abstraction;



    // this class child of car.
    public class Honda extends Car{

        String make="Honda";
        String model="Civic";
        int year= 2020;


        @Override
        public void make() {
            System.out.println("My car is :"+make);

        }

        @Override
        public void model() {
            System.out.println("My car is :"+model);

        }

        @Override
        public void year() {
            System.out.println("My car is :"+year);

        }
    }

