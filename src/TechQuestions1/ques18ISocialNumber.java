package TechQuestions1;

import java.util.Scanner;

public class ques18ISocialNumber {
    public static void main(String[] args) {

    /*    Ask user ta enter his/her first name, last name and Social Security Number.
                Then type a program which makes
        a) initials of the first name and the last name in uppercase,
                other characters will be in lowercase.
                b) all characters except last 4 characters of the Social Security Number “ * ”.
        For example; Suleyman Alptekin *****5678 */
        /*-String pas = "Süleyman Alptekin";
        String pas1 = pas.substring(0,1);
        int pasindx = pas.indexOf(" ")+1;
        String pas2 =pas.substring(pasindx,pasindx+1);
        System.out.println(pas1+" "+pas2);
        int indxx= pas.indexOf("p");
        System.out.println(indxx);*/



       // String sec= "Ahmet HAS";
       // String lcase=sec.toLowerCase();
       // String fcase =lcase.substring(0,1).toUpperCase() +
      //  int  indxx=sec.indexOf(" ")+1;
        //String nsec= sec.replace(sec.substring(0),



        Scanner myObj = new Scanner(System.in);
        System.out.println("Please type your First name and Last name:");
        String obj1 = myObj.nextLine().toUpperCase();
        String obj2 = obj1.substring(1,obj1.indexOf(' ')).toLowerCase();
        String obj3 = obj1.substring(obj1.indexOf(' ')+2,obj1.length()).toLowerCase();
        System.out.println("Please type your Social Security Number:");
        String obj4 = myObj.nextLine();
        String obj5 = obj4.replaceAll(obj4.substring(0,obj4.length()-4),"*******");
        System.out.println(obj1.toUpperCase().charAt(0) + obj2 + " " + obj1.toUpperCase().charAt(obj1.indexOf(' ')+1) + obj3);
        System.out.println(obj5);

        /*

        //
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name, surname and SSN ");
        String str= scan.nextLine();

        String firstchar= str.substring(0,1);
        String secondchar=str.substring(str.indexOf(" ")+1,str.indexOf(" ")+2);
        firstchar=firstchar.toUpperCase();
        //System.out.println(firstchar);
        secondchar=secondchar.toUpperCase();

        //

        String ilkkelime= str.substring(1, str.indexOf(" "));
        ilkkelime=ilkkelime.toLowerCase();
        String ikincikelime= str.substring(str.indexOf(" ")+2, str.lastIndexOf(" "));
        ikincikelime=ikincikelime.toLowerCase();
        System.out.println(firstchar+ilkkelime+" "+secondchar+ikincikelime+" "+"*****"+str.substring(str.length()-4,str.length()));



         */
    }
 }
