package TechQuestions0;

public class ques0Convert {
    public static void main(String[] args) {

    //From small to big
    byte b =12;
    short s=b;
        System.out.println(s);
    short sh= 245;
    int i=sh;
        System.out.println(i);

    // From big to small;

    short srt= 255;
    byte bt=(byte) srt; // byte between-127 and 128 and 0=total 256
        System.out.println(bt);// on tthe console  255-256= -1

    int in = 30521;
    short sht =(short) in;
        System.out.println(sht);

     double db= 8934.56;
     int ing= (int) db;
        System.out.println(ing);

     // difference int ,float and double
        int az= 5/3;
        System.out.println(az);  // gets a integer number
        float as=5f/3f;
        System.out.println(as); // gets a decimal number
        double ax= 5d/3d;
        System.out.println(ax); // gets a decimal number

       //Write a program to assign a value of 100.235 to a double variable and then convert it to int. Print it on the console.

       double dble= 100.235;
       int con=(int) dble;
        System.out.println(con);

     // how to get min and max values in datatype
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

    }
}
