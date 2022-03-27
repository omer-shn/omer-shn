package Classes;

public class PhoneMain {
    public static void main(String[] args) {

        Phone phone =new Phone("General Mobile","Go",1,8,8);
        Phone phone2= new Phone("LG","K10 Lite",2,16,8);
        phone.show();
        System.out.println();
        phone2.show();
    }
}
