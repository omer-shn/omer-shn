package Techday08StringManipul;

public class Sm02 {

    public static void main(String[] args) {

        String fullname = "   Ali Can   ";
        System.out.println(fullname);
        String trname =fullname.trim();
        System.out.println(trname);

        // how can i see if a string is empty or not;
        int numofChar =fullname.length();
        if(numofChar==0) {
            System.out.println("you did not enter yuor name");
        } else {
            System.out.println(" you entered your name");
        }
                //
        boolean isEmpty = fullname.isEmpty();
        System.out.println(isEmpty);


          //for example "", " ", "     " etc .
        String namee= "";
        boolean isBlank = namee.isBlank();
        System.out.println(isBlank);
    }
}
