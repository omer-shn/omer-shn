package Techday06;

public class TERNARY {
    public static void main(String[] args) {

    //FIRST WAY
     /*   Scanner num = new Scanner(System.in);

        System.out.println("enter a number");
        int fig=num.nextInt();

        if(fig>=0){
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
*/
        //SECOND WAY TERNARY (Same the if-else)

        //Conditrion  Question mark   positive   colon   negative senario
        int fig=7;
       String result = fig>0 ? "positive"  : "negative";
        System.out.println(result);

        // Minimum sayıyı yazdır. TERNARY

        int qw=8;
        int qa=10;
        int min  = qw<qa ?   qw : qa;
        System.out.println(min);

        // Eğer sayı pozitif ise kendisini getir yoksa -1 ile çarp ve yazdır.  TERNARY
        // Aynı kod Double ile de yazılabilir.
        int abs=-9;
        int num =abs>0 ? abs : abs*-1;
        System.out.println(num);
    }
}

