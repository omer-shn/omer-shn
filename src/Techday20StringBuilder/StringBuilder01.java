package Techday20StringBuilder;


public class StringBuilder01 {


    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 =new StringBuilder("animals");
        StringBuilder sb3 =new StringBuilder(5);
        StringBuilder sb4 =new StringBuilder("i will go to bazaar");


        String sub1= sb2.substring(3);
        System.out.println(sub1);
        String sub2 =sb2.substring(2,5);
        System.out.println(sub2);
        sb2.indexOf("n");
        System.out.println(sb2.indexOf("n"));
        int lg = sb2.length(); // Gives elements number (animals) 7 elemnt not index number
        System.out.println(lg);
        int lg2 =sb4.length();
        System.out.println(lg2);
        char ch = sb2.charAt(6);
        System.out.println(ch);

        StringBuilder sb5 =new StringBuilder();
        sb5.append("A").append("b");
        System.out.println(sb5);

        StringBuilder sb6 =new StringBuilder().append("A");
        sb6.append("b");
        sb6.append("c").append("d");
        sb6.append("e").append("f").append("g");
        System.out.println(sb6);

        //append = insert

        StringBuilder sb7 =new StringBuilder("bazaar");
        sb7.insert(0,"G");
        System.out.println(sb7);
        sb7.insert(7,"s");
        System.out.println(sb7);
        sb7.insert(3,"z");
        System.out.println(sb7);

        StringBuilder sb8 = new StringBuilder("abcdef");
        sb8.delete(1,3);
        System.out.println(sb8);
        sb8.deleteCharAt(1);
        System.out.println(sb8);

        StringBuilder sb9 =new StringBuilder("abc");
        sb9.toString();
        System.out.println(sb9);
        sb9.reverse();
        System.out.println(sb9);

        StringBuilder ssb =new StringBuilder();
        ssb.append(1).append(22).append(333).append('g').insert(0,"b");
        System.out.println(ssb);
        

       











    }


}

