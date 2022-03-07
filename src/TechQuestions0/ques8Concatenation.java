package TechQuestions0;

public class ques8Concatenation {
    public static void main(String[] args) {


        String s1 ="A"+'A';//con  AA
        String s2 ='A'+"A";//con   AA
        String s3= 1+4+"A"+'A';  //Just this addition  5AA
        String s4 = "A"+'A'+1+4;//con  AA14
        String s5= 12+3+"5"; //Only nuber Addition not String 155
        String s6="5"+12+3; //con  5123
        String s7= "2"+(5+1);// Add only inside paranteses 251


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

        System.out.println();

        int numA=2;
        int numB=3;
        String str1="Study";
        String str2="Hard";

        System.out.println(str1+" "+str2);
        System.out.println(numA+numB+" "+str1);
        System.out.println(str2+numA+numB);
        System.out.println(str2+(numB-numA));
        System.out.println('3'+(numA*(numA+numB))+str1+(numA-numB));

    }
}
