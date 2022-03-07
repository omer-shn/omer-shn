package Techday06;

public class NestedTernaryLeapYear {
    public static void main(String[] args) {

        //  NESTED TERNARY
        // (Condition) ? (ternary1)  :  (ternary2);

        // First condition true ise ilk parta kod bakar. false ise ikinci parta bakar.
        // partlar kendi içinde tekrar değerlendirilir.

        int year = 900;
        String isLeap = (year % 100 == 0) ? (year % 400 == 0 ? "Leap year!" : "not Leap year") : (year % 4 == 0 ? "Leap year!" : "not Leap year");
        System.out.println(isLeap);


        //

        String passw = "salvatore";

        String result = (passw.length() > 8) ? (passw.charAt(0) == 's' ? "valid password" : "invalid password") : (passw.charAt(0) == 'K' ? "valid" : "invalid");
        System.out.println(result);

        //
        int figure =145;

        String threediv = (figure >= 199) ? (figure <= 999 ? "yes" : "no") : (figure % 3 == 0 ? "yes" : "no");
        System.out.println(threediv);

    }
}
