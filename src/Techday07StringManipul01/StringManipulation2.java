package Techday07StringManipul01;

public class StringManipulation2 {
    public static void main(String[] args) {

        String str ="Ali Can";
        String newStr =str.concat("!....").concat("Congrats...");// Ali Can!...Congrats...
        System.out.println(newStr);


        boolean islast =str.endsWith("Can"); // considers lasts characters
        System.out.println(islast); //gives true

        boolean isFirst =str.startsWith("Al"); // considers firsts characters
        System.out.println(isFirst);// gives true

        boolean isFourt =str.startsWith("C",4);// Skip 4 charactyer and look if it begins with C
        System.out.println(isFourt);


    }
}
