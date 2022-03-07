package TechPractice;

import java.util.Scanner;

public class prac10FirstFirstChar {
    public static void main(String[] args) {

        Scanner firstfirst = new Scanner(System.in);
        System.out.println("input your first and last name");
        String ff=firstfirst.nextLine();

        String ffname =ff.substring(0,1); // to get first char the name
        int inxlname=ff.indexOf(" ")+1;  // to get first char after the gap
        String flname =ff.substring(inxlname,inxlname+1);
        System.out.println(ffname+flname);

            //
        String as = "Hasan Haskara";
        String as1=as.substring(0,1);
        int as2=as.indexOf(" ")+1;
        String as3= as.substring(as2,as2+1);
        System.out.println(as1 + as3);

            //
        String pas = "Süleyman Alptekin";
        String pas1 = pas.substring(0,1);
        int pasindx = pas.indexOf(" ")+1;
        String pas2 =pas.substring(pasindx,pasindx+1);
        System.out.println(pas1+" "+pas2);
        int indxx= pas.indexOf("p");
        System.out.println(indxx);
    }
}
