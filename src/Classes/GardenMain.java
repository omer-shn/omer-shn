package Classes;

public class GardenMain {
    public static void main(String[] args) {



        Garden gar = new Garden("Rosa","Red",40);
        System.out.println(gar.flowername+" "+gar.color+" "+gar.leaf);
        Garden gar1 = new Garden("Clove","Blue",25);   //burada Clove consolda çıkmaz
        System.out.println(gar1.flowername+" "+gar1.color+" "+gar1.leaf);//Çünkü this işlevi nedeniyle kaynak class olan Garden dan veri alır
    }
}
