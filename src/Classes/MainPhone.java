package Classes;

public class MainPhone {
    public static void main(String[] args) {

        Mphone phone =new Mphone("General Mobile","Go",1,8,8);
        Mphone phone2= new Mphone("LG","K10 Lite",2,16,8);
        phone.show();
        System.out.println();
        phone2.show();
    }
}
