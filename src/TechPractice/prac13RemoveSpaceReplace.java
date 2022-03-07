package TechPractice;

public class prac13RemoveSpaceReplace {
    public static void main(String[] args) {

        String state= "He dos not live here anymore, lives 2345 palm";
        System.out.println(state); // before
        String rmv= state.replace(" ","");
        System.out.println(rmv);// after


        //
        String constar= state.replace("He","**").replace("here","**");
        System.out.println(constar);

        String repstar =state.replaceAll("[0-9]","#");  //convert numbers to #
        System.out.println(repstar);

        String repstar2=state.replaceAll("[a-z]","!");//all small letters converts to !
        System.out.println(repstar2);

        String repstar3=state.replaceAll("[A-Za-z]","%");//all letters changes to %
        System.out.println(repstar3);

        String repstar4=state.replaceAll("[^A-Za-z]","+");//changes everthing, even spaces except letters
        System.out.println(repstar4);

        String repstar5=state.replaceAll("[^0-9]","*");//changes everthing, even spaces except numbers
        System.out.println(repstar5);

        String repstar6=state.replaceAll("[^ ]","*");//changes everthing,  except spaces
        System.out.println(repstar6);



        /*
            1) \\s means space character
            2) \\S means characters different from space character

            3) \\d means digits
            4) \\D means different from digits

            5) \\w means A-Z and a-z and 0-9 and _
            6) \\W means different from A-Z and a-z and 0-9 and _

            7) \\p{Punct} means all punctuation marks
         */

         String repstar7=state.replaceAll("\\S","*");
        System.out.println(repstar7);

        String repstar8=state.replaceAll("\\s","&");
        System.out.println(repstar8);


        int repstar9=state.replaceAll("\\s","&").length();
        System.out.println(repstar9);

        int repstar10=state.replaceAll("\\D","").length();
        System.out.println(repstar10);

        int repstar11=state.replaceAll("[A-Za-z]","").length();
        System.out.println(repstar11);

         //How many punctuation marks are used in the String

        int total =state.length();
        int markss=state.replaceAll("\\p{Punct}","").length();
        int repstar12=total-markss;
        System.out.println(repstar12);






    }
}
