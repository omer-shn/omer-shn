package Techday26exceptions;

public class Excep03 {
    public static void main(String[] args) {

        String  str="";
        getnumOfCharactersInAString(str);
        String s="Ali";
        getnumOfCharactersInAString(s);
        String t =null;
        getnumOfCharactersInAString(t);

    }
    public static void getnumOfCharactersInAString(String str) {
        System.out.println(str.length());

        try {
            System.out.println(str.length());
        }catch (NullPointerException e) {
            System.err.println("Issue occured when i count the number of characters ==> ");
            e.printStackTrace(); //This parameters for details

        }

    }
}
