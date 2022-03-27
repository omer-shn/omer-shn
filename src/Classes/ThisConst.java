package Classes;

public class ThisConst {

    String name = "Orhan";
    int age= 23;

    ThisConst(String name, int age) {
        name=name;      //public classdski age değerini getirir
        this.age =age;  //Bu yeni oluşturulan methoddahi age değerini getiri
    }
    public static void main (String [] args) {

        ThisConst bkv =new ThisConst("Osman",20);
        System.out.println(bkv.name);
        System.out.println(bkv.age);
    }

}
