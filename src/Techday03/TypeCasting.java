package Techday03;

public class TypeCasting {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("A"+2+3);
        System.out.println(2+3+"A");
        System.out.println(35+"A");
        System.out.println('A'+2+3);
        System.out.println('A'+'a');
        System.out.println(('A'+"A"));
        System.out.println("A"+'A');
        System.out.println('A'+5+"A");
        System.out.println("A"+5+'A');

        char c='?';
        System.out.println(c);
      // small value to big value
        byte by=47; // byte
        int in=by; // now int

        // big value to small value

        double db= 1.2; // double
        short sh= (short)db; // now short

        short r= 258;
        byte dc=(byte) r;
        System.out.println(dc);  // -127 to 128 = 256 total  258/256 >>>>kalan değer 2 consoleda görünür


    }
}
