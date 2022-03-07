package Educa;

public class Edu07PrintF {

    public static void main(String[] args) {

                // Printf Using
        boolean myBoolean = true;
        char myChar = '@' ;
        String myString = "name";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);
            //
        System.out.println();
        //
        System.out.printf("Hi %10s",myString); //10 charakters gap for [Width] için.
     //
        System.out.println();
        //
        System.out.printf("you have this amont %.3f", myDouble); //virgülden sonra 3 ondalık gelir


    }
}
