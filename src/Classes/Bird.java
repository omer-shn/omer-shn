package Classes;

public class Bird {
    public static void main(String[] args) {


        Birdprivate birdlist = new Birdprivate();

            birdlist.getname();
            birdlist.getlifetime(3);
            birdlist.setName("dove");
            birdlist.setdistrict();


        System.out.println(birdlist.getname());
        System.out.println(birdlist.getlifetime(3));

    }
}
