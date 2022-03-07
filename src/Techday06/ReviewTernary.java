package Techday06;

public class ReviewTernary {
    public static void main(String[] args) {


        // şifre 8 karakterden fazla ise ilk harf 'i' midir bak
        // değilse ilk digit 'K' midir bak

        String pwd= "K5sl30dfgr";

        String isValid = (pwd.length()>8) ? (pwd.charAt(0)=='i' ? "Valid password" :"invalid password") : (pwd.charAt(0)=='K' ? "Valid password" :"invalid password");
        System.out.println(isValid);

        //

        //iki değerde pozitif ise birbiriylr çarp, değilse "i do not know how to multply" yaz.
        // fakat burada hem integer herm String partı vardır.
       //  Bu durumda direk >>>>System.out.println();<<< başa yazılır
        int fs =4;
        int sc=5;

        System.out.println( fs>0 && sc>0 ? fs*sc : "i do not knoW how to multply");
        System.out.println();

        //
        int rew= -10;

        String reww= rew>=0  ?  "This is integer is pozitive" :  "This is not negative integer number";
        System.out.println(reww);

        //
        int chesnut = 55;
        int nut     = 45;

        System.out.println(  (chesnut<=60 && nut<= 45)  ? "total :"+2*(chesnut+nut) : "kalsın");




    }

}

