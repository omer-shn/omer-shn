package Techday20StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {


        StringBuilder sb10 = new StringBuilder();
        sb10.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb10); //abbaccca

        String st ="java";
        StringBuilder sb11 = new StringBuilder("java");
        System.out.println(st.equals(sb11)); // false, not equals

        String numbers ="012345678";
        System.out.println(numbers.substring(1,3)); //12
        System.out.println(numbers.substring(7,7)); //blank
        System.out.println(numbers.substring(7)); //78

        int total= 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total+= letters.substring(1,2).length();//1
        total+=letters.substring(4,6).length();//2
       total+=letters.substring(6,6).length(); //blank
      //  total+=letters.substring(6,5).length();//Gives exception err
        System.out.println(total); // 1+2 =3



    }
    public void moreA(int...nums) {}
    public void moreB(String values, int...nums){}
    public void moreC(String []values,int...nums) {}
    public void moreD(String[]values,int[]nums) {}
}