package Techday08StringManipul;

public class Sm01 {
    public static void main(String[] args) {


    String str ="Ali! is 13 years old, I think he is 15";

    //To remove all spaces from the String
    String nuSpace = str.replace(" ","");
        System.out.println(nuSpace);

            //To convert the numbers to star
        String nodigit = str.replaceAll("[0-9]","*");
        System.out.println(nodigit);

        // To convert all letters to !
        String noletters = str.replaceAll("[A-Za-z]","!");
        System.out.println(noletters);

        // To convert all charecters different from letters
        String exletters =str.replaceAll("[^A-Za-z]","?");
        System.out.println(exletters);

        // To convert all charecters different from digits
        String exdigits =str.replaceAll("[^0-9]","*");
        System.out.println(exdigits);

        // To convert all charecters different from space to *
        String exstar= str.replaceAll("[^ ]","*");
        System.out.println(exstar);

        /*

        \\s means space character
        \\S means characters diffrent from space character
        \\d means digits
        \\D means different from digits
        \\w means AZ az 09  and -
        \\W means different from A-Z and a-z and 0-9 and _
        \\p{Punct} means all ounctation marks
        \\PPunct} means all ounctation marks differents

         */

        String exspaces =str.replaceAll("\\s","*");
        System.out.println(exspaces);

        // How many characters are used in string different from space?
        int allspaces = str.replaceAll("\\s","").length();
        System.out.println(allspaces);

        // How many digits are used in the string?
        int alldigits =str.replaceAll("\\D","").length();
        System.out.println(alldigits);

        int allletter =str.replaceAll("[^A-Za-z]","").length();
        System.out.println(allletter);

        int allpunct = str.replaceAll("\\P{Punct}","").length();
        System.out.println(allpunct);

        String allpnnc = str.replaceAll("\\P{Punct}","");
        System.out.println(allpnnc);





}
}