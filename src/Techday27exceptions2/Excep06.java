package Techday27exceptions2;

public class Excep06 {
    public static void main(String[] args) {

        // if exception happen visinle on the console after runnig the code, the exception are called "Run time Exception"
        //The other name of "Run time Exceptions"  is "Unchecked Exceptions"
        // Following are "Run Time Exceptions"

        Object obj = 70;
        convertObjectToString(obj);//Integer cannot be cast to class java.lang.String
    }

    public static void convertObjectToString(Object obj) {

        try {
            String s = (String) obj;
            System.out.println(s);

        } catch (ClassCastException e) {
            System.out.println("Convertion id imposibble between those data types ==>" + e.getMessage());
        }
    }
}