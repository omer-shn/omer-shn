package Techday28abstraction2;

public class Lost extends Calculator{
    @Override
    public int addition(int n1, int n2) {
        return -1;
    }

    @Override
    public int multiplascation(int n1, int n2) {
        return -1;
    }

    @Override
    public int substraction(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int division(int n1, int n2) {

        try { return n1 / n2;}
        catch (ArithmeticException e) {
            return -1;


        }
    }

}
