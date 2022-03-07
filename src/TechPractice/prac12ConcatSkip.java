package TechPractice;

public class prac12ConcatSkip {
    public static void main(String[] args) {

        String thiss = "vieni";
        String nthiss= thiss.concat(" qui ").concat("amigo"); // You can do concatenation by "+" sign but using concat() is better
        System.out.println(nthiss);

        //
        boolean isLast= thiss.endsWith("ni"); // Does the worda end such >>>>kelime böyle mi bitiyor
        System.out.println(isLast);

        boolean isFirst = thiss.startsWith("y");
        System.out.println(isFirst);

              // SKIP THE CHARAKTER İN PARANTESES AND CHECK THE LETTER İS BEGİN

        boolean skip = thiss.startsWith("n",2); //ilk 2 karakteri atla sonra n ile başlarmı kontrolet
        System.out.println(skip);
        boolean skip2 =thiss.startsWith("e",2);//ilk 2 karakteri atla sonra e ile başlarmı kontrolet
        System.out.println(skip2);
        boolean skip3=thiss.startsWith("i",3);// ilk 3 karakteri atla sonra i ile başlarmı kontrolet


    }
}
