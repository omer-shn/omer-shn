package Techday26exceptions;

public class Excep02 {
    public static void main(String[] args) {

        String arr [] = {"Ali", "Can","Vali","Han"};
        getAnElemntFromArray(arr,2); //Veli
        getAnElemntFromArray(arr,0);// Ali
        getAnElemntFromArray(arr,4);// Exception.(ArrayIndexOutOfBoundsException) Index 4 out of bounds for length.  Let's fix that issue!!!!!

    }
    public static void getAnElemntFromArray(String arr [], int idx) {

        try {

            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("An error occured in array operation ==>" +e.getMessage()); //Out err yapıldı.
        }
    }
}
