package Techday21VarArgsAccess;

public class VarArgs {

    public static void main(String[] args) {


        add();
        add(5);
        add(5,10);
        add(5,10,15);
        add(1,4,5,6);

    }
        // CAUTION !!! We can't use any parameters after varargs
        // But we can use any parameter (excepts varargs) before varargs
       // Namely, varargs must be the last parameter every time
     //  We can use just a single varargs in a method parenthesis
    public static  void add(int ...a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        System.out.println(sum);


    }
    //methods that can be created
    public void moreA(int...nums) {}
    public void moreB(String values, int...nums){}
    public void moreD(String[]values,int[]nums) {}


    }








