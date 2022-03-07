package Techday06;

public class switcStatement4aA {

    public static void main(String[] args) {


        char ch = 'a';
        switch (ch) {
            case 'a':
                System.out.println("only");
            case 'z':
                System.out.println("java");
                System.out.print(ch);
                                // no break
            case 'b' :
            case 'B' :
                System.out.print(ch);
            case 'c' :
            case 'C' :
                System.out.println(ch);
                break;
            default:
                System.out.println(ch); // it gets aa
        }

        // SECOND EXAMPLE

        int variable =1;
        switch (variable) {
            case 1 :
                System.out.print("P");
            case 2 :
            case 3 :
                System.out.println("Q");
                break;
            case 4 :
                System.out.println("R");
            default:
                System.out.println("S");// What is output .? it is PQ
        }
    }
}
