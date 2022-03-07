package Techday11DoWhile;

public class Wer {


    int q ;
    int w ;
    int x ;

    public Wer() {
        q = 3;
        w = 7;
        x=q*w;
    }

    public static void main(String[] args) {
        Wer myWer = new Wer();  //myWer Constructor in here
        System.out.println(myWer.x);

    }
}