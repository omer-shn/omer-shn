package Classes;

public class As5 {
    public static void main(String[] args) {


        try {  String st = "123a";
            int num = Integer.parseInt(st) + 4;
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("a input that it is not number");
    }
}
}
