package Techday26exceptions;

public class Excep04 {
    public static void main(String[] args) {


        String str ="123";
        convertStringToInteger(str);

        String s= "123a";  //Exception
        convertStringToInteger(s); // NumberFormatException ==> For input string: "123a";

    }
    public static void convertStringToInteger(String str) {

        //Integer.valueOf >> Gives us ınteger Wrapper Class
        //Integer.parseInt >> Gives us int primitive
        try {
            System.out.println(Integer.parseInt(str) + 1); // toplama yapıldı çünkü değer artık Integer oldu.
        }catch (NumberFormatException e) {
            System.err.println("String could not be converted to an int ==>" +e.getMessage());
        }
    }
}
