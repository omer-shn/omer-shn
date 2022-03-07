package Techday09ForLoops;

public class LoopFor2 {
    public static void main(String[] args) {

        // Put * between characters
        String s= "Java";

        for(int iq=0; iq<s.length()  ; iq +=1) {
            System.out.print(s.charAt(iq)+"*");
        }

        System.out.println();  // For Gap
        String ss= "javas";
        for(int iqq=0; iqq<s.length(); iqq+=2) {
            System.out.print(ss.charAt(iqq)+ "@@");
        }



      String t ="Hello";  //Gets  "Heo"
        for(int iw=0; iw<t.length(); iw++ ) {
            if (t.indexOf( t.charAt(iw)) == t.lastIndexOf(t.charAt(iw) )) {
                System.out.print(t.charAt(iw));

            }
        }

        System.out.println();
        //

        String tuss = "Ambassador";
        for( int fm =0; fm<tuss.length(); fm++) {
            if (tuss.indexOf(tuss.charAt(fm)) == tuss.lastIndexOf(tuss.charAt(fm)) ) {
                System.out.print(tuss.charAt(fm));
            }
        }

        System.out.println();

        String tus = "hilti";
        for(int m=0; m<=tus.length(); m+=1) {
            if ( tus.indexOf(tus.charAt(m)) == tus.lastIndexOf(tus.charAt(m))) {
                System.out.print(tus.charAt(m));

            }
        }



        System.out.println();

        //Type code to print a String in REVERSE after removing spaces
        //Ali Can ===>>>naCilA

        String u ="ali Can";
        String noSpaces = u.replaceAll("\\s","");
        for( int ig =noSpaces.length()-1 ; ig>-1; ig-=1) {
            System.out.print(noSpaces.charAt(ig));
        }




    }
}
