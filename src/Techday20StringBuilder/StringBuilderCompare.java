package Techday20StringBuilder;

public class StringBuilderCompare {
    public static void main(String[] args) {
        StringBuilder seb =new StringBuilder();
        long tm1=System.nanoTime();

        seb.append("kervan");

        for(int i=0;i<1000;i++) {
            seb.append(" ");
        }
        long tm2=System.nanoTime();


        String set =new String();
        long tm3=System.nanoTime();

        seb.append("kervan");

        for(int i=0;i<1000;i++) {
            set+="";
        }
        long tm4=System.nanoTime();
        long difference =tm2-tm1;
        long difference2=tm4-tm3;
        double ultimate =difference2/difference;
        System.out.println(difference);
        System.out.println(difference2);
        System.out.println(ultimate);
    }
    }

