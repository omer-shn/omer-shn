package Techday07;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {


        Scanner scann = new Scanner(System.in);
        System.out.println("enter a String");
        String str = scann.nextLine();

        char firstchar =str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        System.out.println(""+firstchar +lastChar);

            //

        //2.Way substring () method
        String firstCharacter= str.substring(0,1);
        System.out.print(firstCharacter);


        String lastCharacter = str.substring(str.length()-1,str.length());
        System.out.println(lastCharacter);
        // or  String lastCharacter = str.substring(str.length()-1);
        //  System.out.println(lastCharacter);

        System.out.println(firstCharacter+lastCharacter);

        //

 // 2.EXAMPLE  //AD SOYAD İLK HARFLER
        String initialofFirstname= str.substring(0,1);
        int indexofinitialofLastName= str.indexOf(" ")+1;
        String initialofLastname= str.substring(indexofinitialofLastName,indexofinitialofLastName+1);
        System.out.println(initialofFirstname +initialofLastname);


  // 3.EXAMPLE >> Check if any charascter exist in a String or not
      //!.WAY
        String characterToCheck ="n";
        int result =str.indexOf(characterToCheck);
        System.out.println(result);

        if (result==-1) {
            System.out.println("The character does not exist");
        } else {
            System.out.println("The character exist");
        }

        //2.WAY
        boolean isContain =str.contains("X");
        if(isContain) {
            System.out.println("The character exist");
        }else {
            System.out.println("The character does not exist");
        }



    }


}
