package ZSpecial;

import java.util.Scanner;


public class KervansarayString {
    public static void main(String[] args) {

        String sad = "KervaNSaraY";

        System.out.println(sad.length()); //11
        System.out.println(sad.charAt(3));//v
        System.out.println(sad.substring(0,1));//K gets first character
        System.out.println(sad.substring(0,6));//Kervan gets between  1-6 characters
        System.out.println(sad.substring(8,10));// raY gets  between8-11
        System.out.println(sad.substring(1));//ervaNSaray delete first character
        System.out.println(sad.substring(6));//Saray delete between 1-6 characters
        System.out.println(sad.substring(sad.length()-1,sad.length()));// Y  gets last character
        System.out.println(sad.substring(sad.length()-2,sad.length()));// aY gets last 2 characters
        System.out.println(sad.length()-1); // 10 This method 1 character delete get char total the word
        System.out.println(sad.indexOf("S")); //6.Karakter
        System.out.println(sad.toLowerCase()); //kervansaray
        System.out.println(sad.toUpperCase()); // KERVANSARAY
        System.out.println(sad.contains("a")); //true
        System.out.println(sad.isBlank());   // false
        System.out.println(sad.replaceFirst("a", "i")); // KerviNSaraY ilk a'yı i'ye çevirir
        System.out.println(sad.equals("Kervansaray")); //false >>>> büyük/küçük harf farkı
        System.out.println(sad.equalsIgnoreCase("kervansaray"));// true harf duyarlılığı kaldırıldı


        String a= String.valueOf(sad.charAt(1)); // 1.karakter için
        String b= String.valueOf(sad.charAt(2)); // 2.karakter için
        String c= String.valueOf(sad.charAt(3)); // 3.karakter için
        System.out.print(a); //e  yanyana yazmak için prinrln kullanılmaz
        System.out.print(b); //r
        System.out.print(c); //v










    }


}
