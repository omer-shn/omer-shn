package ZSpecial;

public class Reverse {
    public static void main(String[] args) {

        String real= "NAMAZ";
        for( int k=real.length()-1; k>-1; k--)
            System.out.print(real.charAt(k));

        System.out.println();
        //

        String isim = "SENE";
        for (int s=isim.length()-1;s>-1;s-=1)
           System.out.print(isim.charAt(s)+" ");

        System.out.println();

        //
        String w ="qwer";
        String rev="";
        for (int iy=w.length()-1;iy>-1;iy--) {
            //     System.out.print(w.charAt(iy));
            rev=rev+w.charAt(iy);
        }

        if (w.equals(rev)) {
            System.out.println("ok");
        }else System.out.println("not");


    }
}
