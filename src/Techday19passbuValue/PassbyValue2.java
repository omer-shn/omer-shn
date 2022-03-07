package Techday19passbuValue;

public class PassbyValue2 {
    public static void main(String[] args) {

        String nativedil ="Asia";
        System.out.println(nativedil);

        String china = asChine(nativedil);
        System.out.println(china);

        String  japan = asJapan(nativedil);
        System.out.println(japan);

        String malesia = asMalesia(nativedil);
        System.out.println(malesia);

    }
    public static String asChine(String nativedil) {
        return nativedil+"Chine";
    }public static String asJapan(String nativedil) {
        return  nativedil+"Japan";
    }public static String asMalesia(String nativedil) {
        return nativedil+"Malesia";
    }
}
